a = input ()

a, b = a.split(' ')
a= int(a)
b = int(b)

if b%a != 0:
    print (b//a + 1)
else:
    print (b//a)