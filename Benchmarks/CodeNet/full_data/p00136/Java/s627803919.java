freq=Array.new(6, 0)

gets.to_i.times {
  h=gets.to_f
  case
    when h<165
      freq[0]+=1
    when h<170
      freq[1]+=1
    when h<175
      freq[2]+=1
    when h<180
      freq[3]+=1
    when h<185
      freq[4]+=1
    else
      freq[5]+=1
  end
}

freq.each_index { |i|
  puts "#{i+1}:" << '*' * freq[i]
}