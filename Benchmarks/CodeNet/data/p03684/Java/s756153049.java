import sys
import heapq
def getn():
    return int(sys.stdin.readline())
def getnums():
    return list(map(int,(sys.stdin.readline().split())))

INF=10000000000
n = getn()
pos = []
edge = [[] for i in range(n)]
for i in range(n):
    x,y = getnums()
    pos.append([x,y,i])

pos.sort(key=lambda x:x[0])
for i,j in zip(pos, pos[1:]):
    x1,y1,i1 = i
    x2,y2,i2 = j
    cost = min(abs(x1-x2), abs(y1-y2))
    edge[i1].append([cost,i2])
    edge[i2].append([cost,i1])

pos.sort(key=lambda x:x[1])
for i,j in zip(pos, pos[1:]):
    x1,y1,i1 = i
    x2,y2,i2 = j
    cost = min(abs(x1-x2), abs(y1-y2))
    edge[i1].append([cost,i2])
    edge[i2].append([cost,i1])

def prim(start, n):
    ans = 0
    n_set = 1
    group = set([start])
    q = edge[start]
    heapq.heapify(q)
    while(q):
        next_e = heapq.heappop(q)
        if next_e[1] in group:
            pass
        else:
            ans += next_e[0]
            group.add(next_e[1])
            for ne in edge[next_e[1]]:
                heapq.heappush(q, ne)
            n_set += 1
            #print("union: ", next_e[1], group)
            #print(q)
        if n_set == n:
            return ans

ans  = prim(0, n)
print(ans)
#print(edge)



