A,B,C,num = map(int, input().split())
if num <= A+B:
    print(A)
else:
    ans = A-(num-A-B)
    print(ans)