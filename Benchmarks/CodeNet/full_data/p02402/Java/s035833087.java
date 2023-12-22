n = gets.to_i

inputs = gets.split(' ').map(&:to_i).sort!()
puts "#{inputs.first} #{inputs.last} #{inputs.sum}"