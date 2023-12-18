n = int(input())
A = list(map(int, input().split(' ')))

c = 0
for i in range(n):
    can = True
    for j in range(0, i):
        if A[i] > A[j]:
            can = False
            break
    #if can: print(i)
    if can: c+=1

print(c)