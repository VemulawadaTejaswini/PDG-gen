import math
def main():
    while True:
        n = float(raw_input().strip())
        if n == 0.0:
            break
        s = [float(x) for x in raw_input().split()]
        mean = float(sum(s) / n)
        print "%.8f" % (math.sqrt(sum([(x -mean) * (x - mean) for x in s]) / n))

if __name__ == '__main__':
    main()
