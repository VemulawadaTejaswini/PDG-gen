N, Q = map(int, input().split())
2 S = input()
3 t = [0] * (N + 1)
4 for i in range(N):
5 t[i + 1] = t[i] + (1 if S[i : i + 2] == 'AC' else 0)
6 for i in range(Q):
7 l, r = map(int, input().split())
8 print(t[r-1] - t[l-1])