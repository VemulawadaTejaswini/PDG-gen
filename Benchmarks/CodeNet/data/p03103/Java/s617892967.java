import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        int N = fs.nextInt(), M = fs.nextInt();
        long minPrice = 0;
        int[] A = new int[N], B = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = fs.nextInt();
            B[i] = fs.nextInt();
        }
        for(int i = 0; i < M; i++) {
            int min = 1000000000;
            int index = 0;
            for (int j = 0; j < N; j++) {
                if(B[j] != 0) min = Math.min(min, A[j]);
            }
            for(int j = 0; j < N; j++) {
                if(A[j] == min && B[j] != 0) {
                    index = j;
                    break;
                }
            }
            B[index] -= 1;
            minPrice += (long)min;
        }
        System.out.println(minPrice);
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                    throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    }

}