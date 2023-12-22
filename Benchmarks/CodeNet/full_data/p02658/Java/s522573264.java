n=int(input())
x = list(map(int, input().split()))
val=1
length=range(n)
zflag=0
flag=0
for i in length:
    if x[i]==0:
        zflag=1;
if zflag==1:
    print(0)
else:
    for i in length:
        val=val*x[i];
        if val>1000000000000000000:
            print(-1)
            flag=1
            break
    if flag==0:
        print(val)