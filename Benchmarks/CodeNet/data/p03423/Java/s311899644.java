N = input()

d = {'M':0,'A':0,'R':0,'C':0,'H':0}

for i in range(N):
    s = input()
    if s[0] in 'MARCH':
        d[s[0]]+=1

v = list(d.values())
ans = 0

for i in range(5):
    for j in range (i+1,5):
        for k in range (j+1,5):
            ans += v[i]*v[j]*v[k]

print(ans)