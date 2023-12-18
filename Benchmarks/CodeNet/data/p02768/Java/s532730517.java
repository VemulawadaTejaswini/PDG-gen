def ncr(n, r, p): 
    num = den = 1 
    for i in range(r): 
        num = (num * (n - i)) % p 
        den = (den * (i + 1)) % p 
    return (num * power(den,  
            p - 2, p)) % p 

def power(x, y, p) : 
    res = 1 
    x = x % p  
    while (y > 0) : 
        if ((y & 1) == 1) : 
            res = (res * x) % p 
        y = y >> 1  
        x = (x * x) % p 
    return res 
n,a,b=list(map(int,input().split()))
p=1000000007;
r=ncr(n,a,p)
s=ncr(n,b,p)
ans=power(2,n,p)-1
ans=ans-r-s
print(ans%p)