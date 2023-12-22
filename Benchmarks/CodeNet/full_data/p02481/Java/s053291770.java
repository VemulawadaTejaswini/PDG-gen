input = gets

str = input.split(" ")

a = str[0].to_i
b = str[1].to_i

puts "#{ a * b } #{ a * 2 + b * 2 }"