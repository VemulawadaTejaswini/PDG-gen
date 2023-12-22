n,k = map(int,input().split())
a = [int(input()) for i in range(n)]

unko = [0]
for i in range(n):
        unko.append(unko[i]+a[i])
inf = float("inf")*(-1)
mvl = inf
for i in range(n-k+1):
        if unko[i+k]-unko[i] >= mvl:
                mvl = unko[i+k]-unko[i]
print(mvl)
