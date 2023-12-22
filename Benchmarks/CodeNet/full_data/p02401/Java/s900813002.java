class Main
  while true
    str = gets.split(" ")
    a = str[0].to_i
    op = str[1]
    b = str[2].to_i
    case op
    when "+"
      puts a + b
    when "-"
      puts a - b
    when "*"
      puts a * b
    when "/"
      puts a / b
    else
      break
    end
  end
end
