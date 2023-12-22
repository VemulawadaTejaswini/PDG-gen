n = int(input())
nums = [int(x) for x in input().split(" ")]
res = 0
for i in range(0, len(nums)):
	for j in range(i + 1, len(nums)):
		res += (nums[i] * nums[j]) % 1000000007
print(res)