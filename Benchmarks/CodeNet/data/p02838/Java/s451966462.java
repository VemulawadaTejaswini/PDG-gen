
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            long num = sc.nextLong();
            A[i] = num;
        }
        int MK = 61;
        int[] dp = new int[MK];
        for (int k = 0; k < MK; k++) {
            long mask = 1l << k;
            for (int i = 1; i <= N; i++) {
                if ((A[i] & mask) != 0l) {
                    dp[k]++;
                }
            }
        }
        BigInteger ans = BigInteger.ZERO;
        for (int k = 0; k < MK; k++) {
            //System.out.println(((long) dp[k] * (N - dp[k])) << k);
            ans = ans.add(new BigInteger(Long.toString(((long) dp[k] * (N - dp[k])) << k)));
            ans = ans.mod(new BigInteger(Long.toString(MOD)));
            // System.out.println(ans + " " + Long.toBinaryString(ans));
        }
        System.out.println(ans);
    }
}