n = int(input())
test = []
count = 0
for i in range(0, n):
    num_test = int(input())
    for j in range(0, num_test):
        answer = input().split()
        a = answer[1]
        if a == '1':
            count += 1
        else:
            continue
print(count)