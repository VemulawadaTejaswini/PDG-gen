n = int(input())
a = input().split(" ")

sum = 1
for i in range(n):
  sum = sum * int(a[i])

if sum > 1000000000000000000:
  print(-1)
else:
  print(sum)