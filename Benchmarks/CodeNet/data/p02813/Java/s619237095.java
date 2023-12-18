N = int(input())
P = tuple(map(int, input().split()))
Q = tuple(map(int, input().split()))

perm = list(permutations(range(1, N+1), N))
print(abs(perm.index(P) - perm.index(Q)))