import java.io.*;
import java.util.*;

public class Main {

    static class Task {

        private long a;
        private long b;
        private long c;
        private long d;
        private Map<Long, Long> memoMap;
        private static final long MAX = (long) 1e10;
        private Set<Long> visited;

        private long dp(long n) {
//            if (visited.contains(n)) {
//                return MAX;
//            }
//
//            visited.add(n);
            if (n == 1) {
                return 0;
            }

            if (memoMap.containsKey(n)) {
                return memoMap.get(n);
            }

            long minRes = Long.MAX_VALUE;
            long left = Math.max(1, n - 4);
            long right = n + 1;
            for (long i = left; i <= right; i++) {
                long tmpMinRes = (long) (1e18 + 7);
                if (i == 1) {
                    tmpMinRes = Math.abs(i - n) * d;
                    minRes = Math.min(minRes, tmpMinRes);
                    continue;
                }

                if (i % 2 == 0) {
                    long res = dp(i / 2);
                    if (d / 2 > MAX / i) {
                        res += a;
                    } else {
                        res += Math.min(d * (i / 2), a);
                    }
                    tmpMinRes = Math.min(tmpMinRes, res);
                }

                if (i % 3 == 0) {
                    long res = dp(i / 3);
                    if (d * 2 / 3 > MAX / i) {
                        res += b;
                    } else {
                        res += Math.min(d * (i / 3) * 2, b);
                    }
                    tmpMinRes = Math.min(tmpMinRes, res);
                }

                if (i % 5 == 0) {
                    long res = dp(i / 5);
                    if (d * 4 / 5 > MAX / i) {
                        res += c;
                    } else {
                        res += Math.min(d * (i / 5) * 4, c);
                    }

                    tmpMinRes = Math.min(tmpMinRes, res);
                }

                if (tmpMinRes != 1e18 + 7) {
                    long diff = Math.abs(i - n);
                    long curMinRes = diff * d;
                    tmpMinRes += curMinRes;
                    minRes = Math.min(minRes, tmpMinRes);
                }

            }

            memoMap.put(n, minRes);
            return minRes;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
//            System.out.println(1000000000000000000L * 909090);
//            System.out.println(1000000000000000000L * 66666);
//            System.out.println(1000000000000000000L * 77777);
//            System.out.println(Long.MAX_VALUE);
            while ((t--) > 0) {
                long n = scanner.nextLong();
                a = scanner.nextLong();
                b = scanner.nextLong();
                c = scanner.nextLong();
                d = scanner.nextLong();

                memoMap = new HashMap<>();
                visited = new HashSet<>();
                long ans = dp(n) + d;
                out.println(ans);
            }
        }
    }

    private static void sort(double[] arr) {
        Double[] objArr = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(int[] arr) {
        Integer[] objArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(long[] arr) {
        Long[] objArr = Arrays.stream(arr).boxed().toArray(Long[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    public static void main(String[] args) {
        new Thread(null, () -> solve(), "1", 1 << 26).start();
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