import math
def main():
    p = map(float, raw_input().split())
    print "%.8f" % math.sqrt((p[2] - p[0]) ** 2.0 + (p[3] - p[1]) ** 2.0)

if __name__ == '__main__':
    main()
