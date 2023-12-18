import collections
s = int(input())
a = list(map(int,input().split()))
res = 0
sums = [0]
for i in range(n):
    sums.append(sums[i]+a[i])
counts = collections.Counter(sums)
def comb2(n):
    return (n * (n-1))//2
for i in counts:
    res += comb2(counts[i])
print(res)