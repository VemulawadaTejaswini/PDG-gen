N = int(input())
T,A = [0 for i in range(N)],[0 for i in range(N)]
for i in range(N):
    T[i],A[i] = map(int,input().split())
a = 1
b = 1
for i in range(N):
    low = 0
    high = 10**18
    while high - low > 1:
        x = (high + low) // 2
        if a <= T[i] * x and b <= A[i] * x:
            high = x
        else:
            low = x
    a = high * T[i]
    b = high * A[i]
print(a + b)