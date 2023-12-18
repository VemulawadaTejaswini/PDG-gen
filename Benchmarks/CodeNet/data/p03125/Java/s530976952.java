#!/usr/bin/env python3
x = list(map(int, input().split(' ')))
A = x[0]
B = x[1]

if B % A == 0:
    print(A+B)
else:
    print(B-A)
