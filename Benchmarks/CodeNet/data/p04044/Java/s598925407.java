N, L = list(map(int, input().split()))
arr_input=[]
for i in range(N):
	input_ = input()
	if(len(input_)!=L):
		print("Input length is wrong")
		exit()
	arr_input.append(input_)
arr_input.sort()
print("".join(arr_input))