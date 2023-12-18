import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int H;
    static int W;
    static char[][] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();

        A = new char[H][];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            A[i] = s.toCharArray();
        }

        System.out.println( solve() ? "Yes" : "No");
    }

    static boolean solve() {
        int[] cnt = new int[26];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                cnt[A[i][j] - 'a']++;
            }
        }

        int lastH = H;
        while(lastH != 0 ) {
            if( lastH >= 2 ) {
                if( W % 2 == 0 ) {
                    // even H, even W
                    if( !consume(cnt, 4, W/2) ) {
                        return false;
                    }

                } else {
                    // even H, odd W
                    if( !(consume(cnt, 4, W/2) && consume(cnt, 2, 1)) ) {
                        return false;
                    }
                }

                lastH -= 2;
            } else {
                if( W % 2 == 0 ) {
                    if( !consume(cnt, 2, W/2) ) {
                        return false;
                    }

                } else {
                    if( !(consume(cnt, 2, W/2) && consume(cnt, 1, 1)) ) {
                        return false;
                    }
                }

                lastH -= 1;
            }
        }
        return true;
    }

    static boolean consume(int[] cnt, int n, int p) {
        for (int i = 0; i < 26; i++) {
            if( cnt[i] >= n ) {
                cnt[i] -= n;
                p --;
            }
            if( p == 0 ) return true;
        }
        return false;
    }

    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

