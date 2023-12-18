n, k = map(int, input().split())
MAX = 10 ** 4
MOD = 10 ** 9 + 7

fact, inv, fact_inv = [0] * MAX, [0] * MAX, [0] * MAX

fact[0] = fact_inv[0] = 1

for i in range(1, MAX):
    fact[i] = fact[i - 1] * i % MOD
    inv[i] = pow(i, MOD - 2, MOD)
    fact_inv[i] = fact_inv[i - 1] * inv[i] % MOD

def nCr(n, r):
    return fact[n] * fact_inv[r] % MOD * fact_inv[n - r] % MOD

blue, red = k, n - k

for i in range(1, k + 1):
    ans = nCr(blue - 1, i - 1)
    rem = red - i + 1
    ans *= nCr(rem + i, i)
    ans %= MOD

    print(ans)
