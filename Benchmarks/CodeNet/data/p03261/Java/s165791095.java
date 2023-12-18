import sys

stdin = sys.stdin

ni = lambda: int(ns())
na = lambda: list(map(int, stdin.readline().split()))
ns = lambda: stdin.readline().rstrip()  # ignore trailing spaces

n = ni()

ss = []
for i in range(n):
    ss.append(ns())

for i in range(n):
    for j in range(i):
        if ss[i] == ss[j]:
            print("No")
            sys.exit(0)

for i in range(n-1):
    if ss[i][-1] != ss[i+1][0]:
        print("No")
        sys.exit(0)

print("Yes")
