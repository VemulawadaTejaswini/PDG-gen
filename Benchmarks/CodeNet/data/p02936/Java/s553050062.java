n,q=map(int,input().split())
X=[[] for _ in range(n)]
for i in range(n-1):
    a,b=map(int,input().split())
    X[a-1].append(b-1)

C=[0]*n

def dfs(p,x):
    C[p]+=x
    for i in X[p]:
        dfs(i,x)


for i in range(q):
    p,x=map(int,input().split())
    dfs(p-1,x)

print(*C)