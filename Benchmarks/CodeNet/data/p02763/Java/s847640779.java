
import java.util.Scanner;

class BinaryIndexTree {
    final int n;
    final long[] bit;
    public BinaryIndexTree(int n) {
        this.n = n;
        int size = Integer.highestOneBit(n) << 1;
        bit = new long[size + 1];
    }
    long sum(int i) {
        long s = 0;
        while (i > 0) {
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }
    void add (int i, long x) {
        while (i <= n) {
            bit[i] += x;
            i += i & -i;
        }
    }
}
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        BinaryIndexTree[] binaryIndexTrees = new BinaryIndexTree[26];
        for (int i = 0; i < 26; ++i) {
            binaryIndexTrees[i] = new BinaryIndexTree(n);
        }
        for (int i = 0; i < n; ++i) {
            int current = s.charAt(i) - 'a';
            binaryIndexTrees[current].add(i + 1, 1);
        }
        int query = scanner.nextInt();
        for (int i = 0; i < query; ++i) {
            int type = scanner.nextInt();

            if (type == 1) {
                int a = scanner.nextInt();
                int newChar = scanner.next().charAt(0) - 'a';
                int oldChar = s.charAt(a - 1) - 'a';
                binaryIndexTrees[oldChar].add(a, -1);
                binaryIndexTrees[newChar].add(a, 1);
            } else if (type == 2) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int diff = 0;
                for (int j = 0; j < 26; ++j) {
                    long rSum = binaryIndexTrees[j].sum(r);
                    long lSum = binaryIndexTrees[j].sum(l - 1);
                    if (rSum > lSum) {
                        ++diff;
                    }
                }
                System.out.println(diff);
            }
        }
    }
}
