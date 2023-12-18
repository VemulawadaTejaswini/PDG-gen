n = int(input())
arr = list(map(int,input().split()))

N = pow(10,9)+7
def gcd(a,b):
    if b == 0:return a
    else :return gcd(b,a%b)

def lcm(a,b):
    tmp =  (a*b)/gcd(a,b)
    return tmp

hcm = arr[0]
for i in range(1,n):
    hcm = lcm(hcm,arr[i])

res = 0
for num in arr:
    res += (hcm/num)
    res%=N

print(int(res))
    

    
