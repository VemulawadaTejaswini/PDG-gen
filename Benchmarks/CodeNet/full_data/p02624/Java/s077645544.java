import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    static void sieve(int nMax, boolean[] isPrime, int[] spf) {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int n = 2; n <= nMax; n++) {
            if (isPrime[n]) {
                spf[n] = n;
                int i = 2;
                while (i * n <= nMax) {
                    isPrime[i * n] = false;
                    spf[i * n] = n;
                    ++i;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        boolean[] isPrime = new boolean[n + 1];
        int[] spf = new int[n + 1];
        sieve(n, isPrime, spf);
        long ans = 0;

        for (int k = 1; k <= n; k++) {
            long c = 1;
            int a = k;
            long l = 0;
            long prev = -1;
            while (a > 1) {
                int b = a / spf[a];
                if (prev == -1) {
                    ++l;
                } else {
                    if (prev == spf[a]) {
                        l++;
                    } else {
                        c *= (l+1);
                        l = 1;
                    }
                }
                prev = spf[a];
                a=b;
            }
            if (l > 0) c *= (l+1);
            ans += c * k;
        }
        System.out.println(ans);
    }
}
