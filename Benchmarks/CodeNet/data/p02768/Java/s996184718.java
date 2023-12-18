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
    static final BigInteger BIGMOD = BigInteger.valueOf(MOD);
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        BigInteger ans = BigInteger.valueOf(2).modPow(BigInteger.valueOf(N), BIGMOD);
        System.err.println(ans);
        long child = N;
        long mother = 1;
        BigInteger sub;
        for (int i = 1; true; i++) {
            if (i == A) {
                sub = BigInteger.valueOf(child).multiply(BigInteger.valueOf(mother).modInverse(BIGMOD)).mod(BIGMOD);
                ans = ans.add(BIGMOD).subtract(sub).mod(BIGMOD);
                System.err.println(sub);
                System.err.println(ans);
            }
            if (i == B) {
                sub = BigInteger.valueOf(child).multiply(BigInteger.valueOf(mother).modInverse(BIGMOD)).mod(BIGMOD);
                ans = ans.add(BIGMOD).subtract(sub).mod(BIGMOD);
                System.err.println(sub);
                System.out.println(ans.subtract(BigInteger.ONE));
                return;
            }
            child *= N - i;
            child %= MOD;
            mother *= i + 1;
            mother %= MOD;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
