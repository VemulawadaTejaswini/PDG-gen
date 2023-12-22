n = input()
n = int(n)
list = []

i = 0
while(i<n):
	x = input()
	x = int(x)
	list[i] = x
	i = i + 1

maxv = -20000000
minv = list[0]
i = 1
while(i<n):
	if(maxv >= list[i]-minv):
		maxv = maxv
	else:
		maxv = list[i]-minv
	
	if(minv <= list[i]):
		minv = minv
	else:
		minv = list[i]
	i = i + 1

	print(maxv)
