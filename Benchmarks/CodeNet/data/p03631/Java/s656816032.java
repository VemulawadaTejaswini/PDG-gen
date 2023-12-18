def main():
    i = list(map(int, input().split()))
    n = i[0]

    if n < 100 or 999 < n or isinstance(n, int) == False:
        return

    if(str(n[0]) == str(n[2])):
        print('Yes')
    else:
        print('No')

if __name__ == "__main__":
    main()