n = read_line.to_i
a = read_line.split.map(&.to_i64)
all = a.sum
sum = 0i64
min = all
n.times do |i|
  sum += a[i]
  min = {min, (all - sum - sum).abs}.min
end
puts min
