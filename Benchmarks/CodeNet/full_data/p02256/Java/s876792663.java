import sys
def gcd(a, b):
    while b != a :
        if a > b:
             a -= b 
        elif b > a:
            b -= a
    return a
x,y = map(int, raw_input().split())
a = gcd(x,y)
print a

    
    
    
        
    
    