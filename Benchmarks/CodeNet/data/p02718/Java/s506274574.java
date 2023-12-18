N, M = list(map(int, input().split()))
 
A = list(map(int, input().split()))
 
counts = 0
total = sum(A)
for v in A:
    if v >= total / (4 * M):
        counts += 1
if counts >= M:
    print("Yes")
else:
    print("No")
 