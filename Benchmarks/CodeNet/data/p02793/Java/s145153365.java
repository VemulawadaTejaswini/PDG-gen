import sys
from math import sqrt
input = sys.stdin.readline


def prime_factor(n):
    factors = []
    for i in range(2, int(sqrt(n))):
        while n % i == 0:
            factors.append(i)
            n //= i
    if n != 1:
        factors.append(n)
    return factors


mod = 10**9+7
N = int(input())
A = list(map(int, input().split()))

ans = 0
primes = []
for a in A:
    f1 = a
    f2 = 1
    for p in primes:
        if f1 % p == 0:
            f1 //= p
        else:
            f2 = f2 * p % mod
    ans = (ans * f1 + f2) % mod
    primes += prime_factor(f1)
print(ans)
