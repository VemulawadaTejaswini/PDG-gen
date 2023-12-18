import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = EuclideanAlgorithm(a, b);
        long cnt = 1;

        for (long i = 2; i <= Math.sqrt(gcd); i++) {
            if (gcd % i == 0) {
                cnt++;
                while (gcd % i == 0)
                    gcd /= i;
            }
        }

        if (gcd > 1)
            cnt++;
        
        System.out.println(cnt);
    }

    static long EuclideanAlgorithm(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        long re = max % min;
        if (re == 0)
            return min;
        return EuclideanAlgorithm(min, re);
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