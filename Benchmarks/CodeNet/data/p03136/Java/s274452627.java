input()
A = list(map(int,input().split()))
print('Yes' if max(A) < sum(A)/2 else 'No')