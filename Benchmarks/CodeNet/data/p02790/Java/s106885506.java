a, b = map(int, input().split())
if (a<b):
    print (str(a)*b)
elif (b<a):
    print (str(b)*a)
else:
    print (str(a)*a)