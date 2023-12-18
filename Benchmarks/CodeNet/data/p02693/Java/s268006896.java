# ABC165
# We Love Golf
K = int(input())
A, B = map(int, input().split())
for x in range(A,B+1):
    if x % K == 0:
        if x >= A:
            if x <= B:
                print('OK')
                exit()
print('NG')
