a,b =map(int,input().split())
c =map(int,input().split())
ans=True
if range(c)!=a+b+1 :
    print("No")
else :
    for i in range(a+b+1):
        if i==a and c[i]!="-":
            ans=False
        elif c[i]!=0 and c[i]!=1 and c[i]!=2 and c[i]!=3 and c[i]!=4 and c[i]!=5 and c[i]!=6 and c[i]!=7 and c[i]!=8 and c[i]!=9 :
            ans=False
            
if ans:
    print("Yes")
else:
    print("No")