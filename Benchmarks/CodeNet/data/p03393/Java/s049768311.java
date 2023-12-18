s=input()
a='abcdefghijklmnopqrstuvwxyz'
b=[i for i in a if i not in s]
if s == 'zyxwvutsrqponmlkjihgfedcba':
    print(-1)
elif b:
    print(s + b[0])
else:
    for i in range(1, len(s)+1):
        if s[-i:][0] != sorted(s[-i:], reverse=True)[0]:
            b=[str(j) for j in a if j not in s[:-i] + s[-i:][0]]
            print(s[:-i] + b[0])
            break
