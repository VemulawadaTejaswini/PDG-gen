import java.io.*;
import java.util.*;

public class Main {
    private static void solve(InputReader sc, PrintWriter out) throws Exception {
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextLong();
        long ans=0;
        long curmax= arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] < curmax){
                ans += curmax - arr[i];
            }else curmax = arr[i];
        }
        out.println(ans);

    }

    public static Set<Integer> seive(int n) {
        boolean[] arr = new boolean[n + 1];
        Set<Integer> hs = new HashSet<>();
        Arrays.fill(arr, true);
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                for (int j = i + i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) hs.add(i);
        }
        return hs;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
