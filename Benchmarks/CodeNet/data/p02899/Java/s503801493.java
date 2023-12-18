n = int(input())
a=[]

b = list(map(int, input().split()))
for i in range(n):
    4a+=[[i+1, b[i]] ]
    
    
import operator as op
a.sort(key = op.itemgetter(1))

x=""
for i in range(n):
    x+=str(a[i][0])
    if i!=n-1:
        x+=" "
#a = [[3,-9],[2,3],[1,20]]
print(x)