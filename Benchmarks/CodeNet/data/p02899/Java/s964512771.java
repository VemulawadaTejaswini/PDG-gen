n = int(input())
a=[]


for i in range(n):
    s=int(input())
    a+=[[i+1, s] ]
    
    
import operator as op
a.sort(key = op.itemgetter(1))

x=""
for i in range(n):
    x+=str(a[i][0])
    if i!=n-1:
        x+=" "
#a = [[3,-9],[2,3],[1,20]]
print(x)