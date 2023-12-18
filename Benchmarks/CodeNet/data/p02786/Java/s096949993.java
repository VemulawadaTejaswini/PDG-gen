H = int(input())
res, cnt = 0, 1
while H > 1:
    H = H // 2
    res += cnt
    cnt *= 2
print(res + cnt)
