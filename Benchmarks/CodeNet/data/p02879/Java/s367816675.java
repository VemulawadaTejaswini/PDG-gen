str = input()
data = "".split(str)
n1 = int(data[0])
n2 = int(data[1])
if (n1 >9 or n2 > 9):
    print(-1)
else:
    print(n1*n2)