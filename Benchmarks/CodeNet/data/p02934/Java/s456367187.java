n=int(input())
a=[int(v) for v in input().split(' ')]

sum =0
for v in a:
  sum+=1/v

print("%f",1/sum)
