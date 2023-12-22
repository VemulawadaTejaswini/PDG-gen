a,b,c = gets.split(' ').collect{|c|c.to_i}
puts a<b && b<c ? 'Yes' : 'No'