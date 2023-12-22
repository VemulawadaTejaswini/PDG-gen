
import java.util.Scanner;
import java.lang.Math;

public class Main {
    static int m = (int) Math.pow(5.0, 12.0);
    static int[] T;

    static long h1(long i) {
        return i % m;
    }

    static long h2(long i) {
        return 1 + i % (m-1);
    }

    static long h(long i, long call) {
        long key = h1(i) + call * h2(i);
        if (T[(int)key] != 0) {
            return h(i, call + 1);
        } else {
            return key;
        }
    }

    public static void main(String[] args) {
        T = new int[m];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String op = s.next();

            String acgt = s.next();
            long num = str2int(acgt);

            if (op.equals("insert")) {
                long key = h(num, (long)0);
                T[(int)key] = (int)num;
            }
            if (op.equals("find")) {
                if (T[(int)num] != 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

    static long str2int(String str) {
        char[] chars = str.toCharArray();
        int digits = chars.length;

        long p = 1;
        long is = 0;
        for (int i = 0; i < digits; i++) {
            is += p * char2int(chars[i]);
            p *= 5;
        }

        return is;
    }

    static int char2int(char c) {
        int i = 0;
        switch (c) {
            case 'A': {
                i = 1;
                break;
            }
            case 'C': {
                i = 2;
                break;
            }
            case 'G': {
                i = 3;
                break;
            }
            case 'T': {
                i = 4;
                break;
            }
        }
        return i;
    }
}

