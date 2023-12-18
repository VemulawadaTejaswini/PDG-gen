import sys

a,b=map(int,input().split())
c=b-a
ans=0
for i in range(1,c+1,1):
	ans+=i
ans-=b
print(ans)
	