func readInts() -> [Int] {
    return readLine()!.split(separator: " ").map { Int($0)! }
}

let nab=readInts()
let n=nab[0]
let l=nab[1]
var sum=0
var min=l
for i in 2...n{
  var c=l+i-1
  sum+=c
  if(abs(c)<abs(min)){sum-=c
                      sum+=min
                      min=c
                      }
}

print(sum)