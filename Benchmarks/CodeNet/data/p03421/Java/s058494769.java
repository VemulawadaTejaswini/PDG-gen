import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N, A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();

        int[] arr = solve();
        if( arr == null ) {
            System.out.println(-1);
        } else {
            StringJoiner j = new StringJoiner(" ");
            for (int i : arr) {
                j.add(String.valueOf(i));
            }
            System.out.println(j.toString());
        }
    }

    static int[] solve() {
        if( A + B > N + 1 ) return null;
        if( N > A * B ) return null;


        // LISでカードを並べた気持ちになる
        // 縦にならんだ数がLDSになる模様
        //
        // 例 N = 10, A = 5, B = 3の場合
        // 6 7 8 9 10
        // 4 5
        // 1 2 3
        // => 6 7 8 9 10 4 5 1 2 3

        int[] arr = new int[N];

        // まず LISの長さを確保する
        for (int i = 0; i < A; i++) {
            arr[i] = N - A + i + 1;
        }

        if( B == 1 ) return arr;

        // カードの高さがLDS
        // すでに一枚はならんでいるのでそれを考慮する
        int H = B - 1;
        int W = ((N - A) + (H - 1)) / H;

        int[][] HW = new int[H][W];
        int num = 1;
        for (int h = H-1; h >=0; h--) {
            for (int w = 0; w < W; w++) {
                if( num <= N - A ) {
                    HW[h][w] = num++;
                }
            }
        }

//        System.out.println(H + " " + W);
//        for (int[] hw : HW) {
//            System.out.println( Arrays.toString(hw) );
//        }

        int idx = A;
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if( HW[h][w] != 0 ) {
                    arr[idx++] = HW[h][w];
                }
            }
        }

        return arr;
    }

    @SuppressWarnings("unused")
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
