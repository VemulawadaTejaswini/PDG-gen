def coder(a,b):
    ans = 0
    if a + b < 24:
        return a + b
    else:
        return a + b % 24

def main():
    a , b = map(int, input().split())
    print(coder(a , b))

if __name__ == '__main__':
    main()