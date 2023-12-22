def main():
    n = int( input() )
    A = [int(i) for i in input().split()]

    for i in range(1, n):
        v = A[i]
        j = i - 1
        while j >= 0 and A[j] > v:
            A[j + 1] = A[j]
            j -= 1
        A[j + 1] = v
        print(A)

if __name__ == '__main__':
    main()

