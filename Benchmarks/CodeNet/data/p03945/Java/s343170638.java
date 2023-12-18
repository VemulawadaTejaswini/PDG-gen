S = input()
pre = "X"
B, W = 0, 0
for s in S:
    if s != pre:
        if s == "B":
            B += 1
        else:
            W += 1
        pre = s

if B == 0 or W == 0:
    print(0)
elif B == W:
    print(B * 2 - 1)
else:
    x, y = min(B, W), max(B, W)
    print(x * 2)