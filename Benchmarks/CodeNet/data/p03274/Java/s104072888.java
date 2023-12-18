N,K = [int(i) for i in input().split()]
X = [int(i) for i in input().split()]

ans = 10**9
for i in range(N-K+1):
    l = X[i]
    r = X[i+K-1]
    if l < 0 and r <= 0:
        tmp = -l
    elif l >= 0 and r > 0:
        tmp = r
    else:
        tmp = min(abs(l),r)*2 + max(abs(l),r)
    ans = min(ans,tmp)
print(ans)
