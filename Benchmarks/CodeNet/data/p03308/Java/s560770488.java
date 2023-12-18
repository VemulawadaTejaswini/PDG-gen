n = gets.chomp.to_i
a = gets.chomp.split(' ').map{|i| i.to_i}
max = 0
n.times do |i|
        i + 1.upto(n - 1) do |j|
                if max < (a[i] - a[j]).abs then
                        max = (a[i] - a[j]).abs
                end
        end
end
puts max