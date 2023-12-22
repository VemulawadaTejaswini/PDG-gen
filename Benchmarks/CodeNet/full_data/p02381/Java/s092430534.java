import math
while True:
    n = int(raw_input())
    if n == 0:break
    s = map(int,raw_input().split())
    do = float(sum(s))/n
    ans = (sum(map(lambda x: (x - do)**2,s)))/n
    print("%f" % math.sqrt(ans))
    