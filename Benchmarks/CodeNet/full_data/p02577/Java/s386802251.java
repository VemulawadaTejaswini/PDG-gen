def digitSum(n):
    s = str(n)
    array = list(map(int, s))
    return sum(array)

N = int(input())

sum = digitSum(N)

if sum%9==0:
  print("Yes")
else:
  print("No")