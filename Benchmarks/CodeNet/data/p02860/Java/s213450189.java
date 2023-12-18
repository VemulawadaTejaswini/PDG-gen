#data = list(map(int,input().split()))
N = int(input())
S = input()

n = int(N/2)

A = ""

for i in range(n):
    A += S[i]

#print(A)

if S==A+A:
    print("Yes")
else:
    print("No")
