import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        int mod = 1000000007;
        long ans = 0;
        long base = 1;
        for (int i = 0; i < 60; i++) {
            int zeroNum = 0;
            int oneNum = 0;

            for (int j = 0; j < N; j++) {
                int bit = (int)((A[j] >> i) & 1);

                if (bit == 0) {
                    zeroNum++;
                } else {
                    oneNum++;
                }
            }

            ans += (((zeroNum * oneNum) % mod) * base) % mod;
            base *= 2;
        }

        ans %= mod;

        System.out.println(ans);
    }
}
