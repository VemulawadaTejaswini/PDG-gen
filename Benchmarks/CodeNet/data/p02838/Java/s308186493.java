
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
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            A[i] = num;
        }
        int MK = 62;
        int[] dp = new int[MK];
        for (int k = 0; k < MK; k++) {
            long mask = 1l << k;
            for (int i = 0; i < N; i++) {
                if ((A[i] & mask) != 0l) {
                    dp[k]++;
                }
            }
        }
        long ans=0;
        // BigInteger ans = BigInteger.ZERO;
        // BigInteger mod = new BigInteger(Long.toString(MOD));
        for (int k = 0; k < MK; k++) {
            // System.out.println(((long) dp[k] * (N - dp[k])) << k);
            // ans = ans.add(new BigInteger(Long.toString(dp[k] * (N - dp[k]))).shiftLeft(k).mod(mod)).mod(mod);
            // ans = ans.mod(new BigInteger(Long.toString(MOD)));
            // System.out.println(ans);
            long tmp = 1l<<k;
            tmp%=MOD;
            tmp*=dp[k] * (N - dp[k]);
            tmp%=MOD;
            ans+=tmp;
            ans%=MOD;
        }
        // ans = ans.mod(mod);
        System.out.println(ans);
    }
}