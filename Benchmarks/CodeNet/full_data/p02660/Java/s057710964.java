import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();

        boolean[] isNotPrime = new boolean[(int)Math.sqrt(n)+5];
        for (int i = 3; i < isNotPrime.length; i+=2) {
            if (!isNotPrime[i]) {
                for (int j = i*2; j < isNotPrime.length; j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }

        long ans = 0;
        for (int i = 2; i < isNotPrime.length; i+=2) {
            if (n % i == 0) {
                n /= i;
                ans++;
            }
        }

        for (int i = 3; i < isNotPrime.length; i+=2) {
            long z = i;
            while (n % z == 0) {
                n /= z;
                ans++;
                z += i;
            }
        }

        if (n >= isNotPrime.length)
            ans++;

        System.out.println(ans);
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}