import java.util.*;
import java.io.*;

public class Main {

    private static final long mod = 1_000_000_007l;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = in.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < 61; ++i) {
            int[] c = new int[2];
            for (int j = 0; j < N; ++j) {
                c[(int) (arr[j] % 2)]++;
                arr[j] >>= 1;
            }


            ans = (ans + mul((long) c[0], (long) c[1], (1l<<i) % mod)) % mod;
        }
        
        System.out.println(ans);
    }

    public static long mul(long a, long b, long c) {
        long ret = 1;
        ret = (ret * a) % mod;
        ret = (ret * b) % mod;
        ret = (ret * c) % mod;
        return ret % mod;
    }
}