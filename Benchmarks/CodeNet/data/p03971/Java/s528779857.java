n,a,b = map(int,input().split())

a_cnt,b_cnt,cnt = 0,0,0
s = input()
cnt = a+b
for i in range(n):
    if s[i] == "a":
        if a_cnt + b_cnt <= cnt:
            #print(a_cnt + b_cnt)
            print("Yes")
        else:
            print("No")
        a_cnt +=1
    elif s[i] == "b":
        if a_cnt + b_cnt < cnt and b_cnt < b:
            print("Yes")
        else:
            print("No")
        b_cnt +=1
    elif s[i] == "c":
        print("No")
