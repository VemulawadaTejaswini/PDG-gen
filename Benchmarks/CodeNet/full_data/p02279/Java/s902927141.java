# coding=utf-8
def setDepth(index, Tree):
    if Tree[index][1] == -1:
        Tree[index][2] = 0
    else :
        Tree[index][2] = 1 + Tree[ Tree[index][1] ][2]
    for i in Tree[index][4]:
        setDepth(i, Tree)

def main():
    # データ入力
    n = int( input() )
    Tree = [] # 0=>n-1まで, [id, parent, depth, type, [child]]
    for i in range(n):
        Tree.append([0, -1, 0, "root", []])

    tmp = []
    for i in range(n):
        tmp = [int(x) for x in input().split()] # [Node, num, 子1, 子2, ...]
        Tree[tmp[0]][0] = tmp[0]
        Tree[tmp[0]][4] = tmp[2: 2+tmp[1] ]

    for i in range(n):
        for j in Tree[i][4]:
            Tree[j][1] = j # parentを代入

    # typeを求める
    for i in range(n):
        if Tree[i][1] == -1:
            root = i
            Tree[i][3] = "root"
        elif Tree[i][4] == []:
            Tree[i][3] = "leaf"
        else :
            Tree[i][3] = "internal node"

    setDepth(root, Tree)

    for i in range(n):
        print("node :" + str( Tree[i][0] ), end = " " )
        print("parent = " + str( Tree[i][1] ), end = ", " )
        print("depth = " + str( Tree[i][2] ), end = ", " )
        print( Tree[i][3], end = ", " )
        print("[", end="")
        length = len( Tree[i][4] )
        for j in Tree[i][4][0: length - 1]:
            print(str(j), end=", ")
        if length > 0:
            print( str(Tree[i][4][length-1]) , end="")
        print("]")

if __name__ == '__main__':
    main()

