import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {

        void solve(InputReader in, PrintWriter out) {
            int N = in.nextInt();
            Map<Integer, Integer> prime = new HashMap<>();
            
            for (int i = 2; i <= N; ++i) {
                for (Map.Entry<Integer, Integer> e : Prime.primeDivision(i).entrySet()) {
                    int v = prime.containsKey(e.getKey()) ? prime.get(e.getKey()) : 0;
                    prime.put(e.getKey(), v + e.getValue());
                }
            }
            
            int ge74 = 0, ge24 = 0, ge14 = 0, ge4 = 0, ge2 = 0;
            for (int v : prime.values()) {
                if (v >= 74) ge74++;
                if (v >= 24) ge24++;
                if (v >= 14) ge14++;
                if (v >= 4) ge4++;
                if (v >= 2) ge2++;
            }
            
            int ans = ge74 + ge24*(ge2 - 1)+ ge14*(ge4 - 1) + ge4*(ge4 - 1)*(ge2 - 2)/2; 
            out.println(ans);
        }

    }

    static class Prime {
        static Map<Integer, Integer> primeDivision(int n) {
            Map<Integer, Integer> factors = new HashMap<>();

            for (int base = 2; base * base <= n; ++base) {
                int exp = 0;
                while (n % base == 0) {
                    n /= base;
                    exp++;
                }
                factors.put(base, exp);
            }
            if (n > 1)
                factors.put(n, 1);

            return factors;
        }

        static boolean isPrime(int n) {
            for (int i = 2; i * i < n; ++i) {
                if (n % i == 0)
                    return false;
            }
            return n > 1;
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}