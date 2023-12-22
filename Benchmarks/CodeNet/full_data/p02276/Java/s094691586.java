list=[]

def partition(p,r):
	t=0
	x=list[r]
	i=p-1
	j=p
	while(j<r):
		if(int(list[j])<=x):
			i+=1
			t=int(list[i])
			list[i]=list[j]
			list[j]=t
		j+=1

	t=int(list[i+1])
	list[i+1]=list[r]
	list[r]=t

	return i+1

def main():
	n=int(input())
	i=0
	while(i<n):
		list.append(int(input().split()))
		i+=1

	q=partition(0,n-1)
	i=0
	while(i<n):
		if(i==q):
			print("[",end="")
			print(str(list[i]),end="")
			print("] ",end="")
		else:
			print(str(list[i])+" ",end="")
		i+=1
	print()
	return 0

if __name__ == "__main__":
	main()

