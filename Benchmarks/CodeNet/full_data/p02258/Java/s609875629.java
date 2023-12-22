n = input()
n = int(n)
list = []

i = 0
while(i<n):
	x = input()
	x = int(x)
	list.append(x)
	i = i + 1

maxv = -20000000
minv = list[0]
i = 1
while(i<n):
        maxv = max(maxv, list[i]-minv)
        minv = min(minv, list[i])
        i = i + 1
	
print(maxv)

