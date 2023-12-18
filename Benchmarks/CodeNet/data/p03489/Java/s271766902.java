n = int(input())
li = list(map(int,input().split()))
set = []
for l in li:
  if set.count(l) == 0 :
    set.append(l)
result = 0
for l in set:
  if li.count(l) == l:
    continue
  elif li.count(l) < l:
    limit = li.count(l)
    result += limit
  elif li.count(l) > l:
    limit = li.count(l) - l
    result += limit

print(result)

