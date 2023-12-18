h, n = map(int, input().split())
sum = 0
for i in list(map(int, input().split())):
    sum += i
if sum >= h:
    print("Yes")
else:
    print("No")