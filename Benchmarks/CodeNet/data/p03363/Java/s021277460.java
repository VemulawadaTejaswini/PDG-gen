import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
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
        int N;
        long[] A, sumFromLeft;
        long sumFromRight = 0, ans = 0;
        List<Map<Long, Long>> sumMapFromRight;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            A = in.nextLongArray(N);

            sumFromLeft = new long[N];
            for (int i = 0; i < N; ++i) {
                if (i == 0) {
                    sumFromLeft[i] = 0;
                } else {
                    sumFromLeft[i] = sumFromLeft[i - 1];
                }
                sumFromLeft[i] += A[i];
                if (sumFromLeft[i] == 0) ans++;
            }

            sumMapFromRight = new ArrayList<Map<Long, Long>>(N);
            for (int i = 0; i < N; ++i) {
                sumFromRight += A[N - 1 - i];
                if (sumFromRight == 0) ans++;
                if (i > 0) {
                    sumMapFromRight.add(new HashMap<>(sumMapFromRight.get(i - 1)));
                } else {
                    sumMapFromRight.add(new HashMap<>());
                }
                long value = sumMapFromRight.get(i).containsKey(sumFromRight) ? sumMapFromRight.get(i).get(sumFromRight) : 0;
                sumMapFromRight.get(i).put(sumFromRight, value + 1);
            }
            Collections.reverse(sumMapFromRight);

            for (int i = 0; i < N - 2; i++) {
                long diff = sumFromLeft[N - 1] - sumFromLeft[i];
                ans += sumMapFromRight.get(i + 2).containsKey(diff) ? sumMapFromRight.get(i + 2).get(diff) : 0;
            }

            out.println(ans);
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
