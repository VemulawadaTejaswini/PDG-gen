a,b = map(int, input().split())
flag = 0
for i in [a,b,a+b]:
    if i % 3 == 0:
        flag = 1
        break
if flag:
    print("Possible")
else:
    print("Impossible")
