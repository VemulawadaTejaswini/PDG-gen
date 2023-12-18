n = int(input())
a = [list(map(int, input().split())) for i in range(n)]
b = sorted(a, key=lambda x: x[1])
judge = 0
flag = "Yes"
for j in range(n):
  judge += b[j][0]
  if(judge >  b[j][1]):
    print("No")
    flag = "No"
    break
    
if(flag == "Yes"):
  print("Yes")
  