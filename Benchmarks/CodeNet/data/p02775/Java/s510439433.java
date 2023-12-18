import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        String str = sc.next();
        BigInteger N = new BigInteger(str);
        // BigInteger R;
        int f = getAt(N, 0);
        if (f / 10 >= 5) {
            System.err.println("c1");
            N = N.subtract(bigger(N)).abs();
            ans += 1;
        } else {
            BigInteger N1 = N.subtract(equaler(N).multiply(BigInteger.valueOf(f / 10 + 1))).abs();
            BigInteger N2 = N.subtract(equaler(N).multiply(BigInteger.valueOf(f / 10))).abs();
            if (N1.compareTo(N2) < 0) {
                System.err.println("c2");
                N = N1;
                ans += f / 10 + 1;
            } else {
                System.err.println("c3");
                N = N2;
                ans += f / 10;
            }
        }
        System.err.println(f + " " + N);
        while (N.compareTo(BigInteger.valueOf(10)) >= 0) {
            int num = getAt(N, 0);
            BigInteger N1 = N.subtract(equaler(N).multiply(BigInteger.valueOf(num / 10 + 1))).abs();
            BigInteger N2 = N.subtract(equaler(N).multiply(BigInteger.valueOf(num / 10))).abs();
            if (N1.compareTo(N2) < 0) {
                N = N1;
                ans += num / 10 + 1;
            } else {
                N = N2;
                ans += num / 10;
            }
            System.err.println(num + " " + N);
        }
        ans += Math.min(N.intValue(),11-N.intValue());
        System.out.println(ans);
    }

    int getAt(BigInteger N, int pos) {
        String str = N.toString();
        if (str.length() > 1) {

            return Integer.parseInt(N.toString().substring(pos, pos + 2));
        } else {

            return Integer.parseInt(N.toString().substring(pos, pos + 1));
        }
    }

    BigInteger bigger(BigInteger N) {
        int len = N.toString().length();
        String str = "1";
        for (int i = 0; i < len; i++) {
            str += "0";
        }
        return new BigInteger(str);
    }

    BigInteger equaler(BigInteger N) {
        int len = N.toString().length();
        String str = "1";
        for (int i = 1; i < len; i++) {
            str += "0";
        }
        return new BigInteger(str);
    }

    public static void main(String[] args) {
        new Main();
    }
}
