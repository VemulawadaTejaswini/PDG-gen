import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader reader;
    static PrintWriter writer;
    static StringTokenizer tokenizer;

    static String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    static void banana() throws IOException {
        long n = nextLong();
        String s = nextToken();
        long res = 1;
        long mod = 998244353;
        long r = 0;
        long g = 0;
        long b = 0;
        if (n != 1) {
            res = n * (n - 1) % mod;
        }
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                r++;
            } else if (c == 'G') {
                g++;
            } else {
                b++;
            }
            if (r > 0 && g > 0 && b > 0) {
                res = res * r % mod * g % mod * b % mod;
                r--;
                g--;
                b--;
            }
        }
        writer.println(res);
    }

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(System.out);
        tokenizer = null;
        banana();
        reader.close();
        writer.close();
    }
}