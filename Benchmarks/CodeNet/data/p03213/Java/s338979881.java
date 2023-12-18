import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            // 74
            // 2, 24
            // 4, 14
            // 2, 4, 4

            boolean[] isPrime = new boolean[101];
            List<Integer> primes = new ArrayList<>();
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;
            for (int i = 2; i <= 100; i++) {
                if (isPrime[i]) {
                    primes.add(i);
                    for (int j = i * 2; j <= 100; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            Map<Integer, Integer> map = new HashMap<>();
            for (int prime : primes) map.put(prime, 0);
            for (int i = 2; i <= n; i++) {
                int tmp = i;
                for (int prime : primes) {
                    if (tmp % prime == 0) {
                        while (tmp % prime == 0) {
                            map.merge(prime, 1, Integer::sum);
                            tmp /= prime;
                        }
                    }
                    if (tmp == 1) break;
                }
            }

            int ans = 0;

            // 74
            for (int prime : primes) {
                if (map.get(prime) >= 74) ans++;
            }

            // 2, 24
            for (int prime1 : primes) {
                for (int prime2 : primes) {
                    if (prime1 == prime2) continue;

                    if (map.get(prime1) >= 2 && map.get(prime2) >= 24) ans++;
                }
            }

            // 4, 14
            for (int prime1 : primes) {
                for (int prime2 : primes) {
                    if (prime1 == prime2) continue;

                    if (map.get(prime1) >= 4 && map.get(prime2) >= 14) ans++;
                }
            }

            // 2, 4, 4
            for (int prime1 : primes) {
                for (int prime2 : primes) {
                    if (prime1 == prime2) continue;

                    for (int prime3 : primes) {
                        if (prime1 == prime3 || prime2 >= prime3) continue;

                        if (map.get(prime1) >= 2 && map.get(prime2) >= 4 && map.get(prime3) >= 4) ans++;
                    }
                }
            }

            out.println(ans);
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

