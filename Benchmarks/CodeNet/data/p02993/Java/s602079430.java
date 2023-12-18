var str=readLine()!

for num in 0...3{
  let a=str.index(str.startIndex,offsetBy:num)
  let b=str.index(str.startIndex,offsetBy:num+1)

  if str[a]==str[b] {
    print("Bad")
    break;
  }
  else if num==3 {
    print("Good")
  }
}