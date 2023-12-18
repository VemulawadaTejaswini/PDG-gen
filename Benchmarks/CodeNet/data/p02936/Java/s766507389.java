import sys
from operator import itemgetter

n,q = [ int(x) for x in sys.stdin.readline().strip().split() ]
edge= [ [] for _ in range(n-1) ]
for i in range(n-1):
    edge[i] = [ int(x)-1 for x in sys.stdin.readline().strip().split() ]
edge.sort( key=itemgetter(0) )
c= [ 0 for _ in range(n) ]
for i in range(q):
    p,x= [ int(x) for x in sys.stdin.readline().strip().split() ]
    c[p-1]+= x
#
for a,b in edge: c[b]+= c[a]

print( *c )