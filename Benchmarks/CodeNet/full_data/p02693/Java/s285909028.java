K = input()
# A = input()
# B = input()

# a = int(A)
# b = int(B)
k = int(K)

a,b=map(int,input().split())

for i in range(a,b+1):
	if i % k == 0:
		print('OK')
		break
	else:
		if i == b:
			print('NG')
