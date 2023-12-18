n = int(input())

if n % 2 == 0:
    # 1 <-> n, 2 <-> n-1... is Pair
    for i in range(1, n + 1):
        for j in range(i + 1, n + 1):
            if i + j != n + 1:
                print(str(i) + " " + str(j))
else:
    # Each edge has (sum - N)
    for i in range(1, n + 1):
        for j in range(i + 1, n + 1):
            if i + j != n:
                print(str(i) + " " + str(j))
