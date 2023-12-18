N = int(input())
D = list(map(int, input().split(" ")))
mod = 998244353

count = [0 for i in range(N)]
for i in range(N):
    count[D[i]] += 1
max_dist = max(D)
ans = count[0]

for i in range(1, max_dist + 1):
    ans *= (count[i - 1] ** count[i]) % mod
    ans %= mod

if count[0] > 1 and D[0] == 0:
    ans = 0

print(ans % 998244353)