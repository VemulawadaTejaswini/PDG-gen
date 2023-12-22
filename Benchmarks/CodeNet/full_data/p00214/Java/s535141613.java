### subroutines

def o_prod(p, v0, v1)   # (p - v0) x (v1 - v0)
  (p[0] - v0[0]) * (v1[1] - v0[1]) - (v1[0] - v0[0]) * (p[1] - v0[1])
end

def inside?(p, vs)
  nump = numm = 0

  (0..3).map{|i| [vs[i], vs[(i + 1) % 4]]}.each do |v0, v1|
    op = o_prod(p, v0, v1)
    if op > 0
      nump += 1
    elsif op < 0
      numm += 1
    end
    return false if nump > 0 && numm > 0
  end
  true
end

def cross_lines?(u0, u1, v0, v1)
  ux = u1[0] - u0[0]
  uy = u1[1] - u0[1]
  vx = v1[0] - v0[0]
  vy = v1[1] - v0[1]

  det = -ux * vy * vx * uy
  return false if det == 0

  vux = v0[0] - u0[0]
  vuy = v0[1] - u0[1]

  t = (-vy * vux + vx * vuy).to_f / det
  s = ( uy * vux + ux * vuy).to_f / det

  t >= 0.0 && t <= 1.0 && s >= 0.0 && s <= 1.0
end

def cross_quads?(q1, q2)
  for p1 in q1
    return true if inside?(p1, q2)
  end

  for p2 in q2
    return true if inside?(p2, q1)
  end

  (0..3).map{|i| [q1[i], q1[(i + 1) % 4]]}.each do |u0, u1|
    (0..3).map{|i| [q2[i], q2[(i + 1) % 4]]}.each do |v0, v1|
      return true if cross_lines?(u0, u1, v0, v1)
    end
  end

  false
end

### main

while true
  n = gets.strip.to_i
  break if n == 0

  n.times.each do
    m = gets.strip.to_i

    quads = []

    m.times.each do
      q = gets.strip.split(' ').map{|s| s.to_i}
      quads << 0.step(6, 2).map{|i| [q[i], q[i + 1]]}
    end

    ids = (0...m).map{|id| id}

    for i in (0...m)
      for j in ((i + 1)...m)
        if cross_quads?(quads[i], quads[j])
          i0 = i
          while ids[i0] != i0
            ids[i0] = i0
          end
          ids[i0] = j
        end
      end
    end

    puts (0...m).select{|i| ids[i] == i}.length
  end
end