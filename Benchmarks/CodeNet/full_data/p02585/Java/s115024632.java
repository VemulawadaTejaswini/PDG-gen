import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int K = in.nextInt();
        int[] P = new int[N];
        int[] C = new int[N];
        for (int n = 0; n < N; n++)
            P[n] = in.nextInt() - 1;
        for (int n = 0; n < N; n++)
            C[n] = in.nextInt();

        int[] cycle = new int[N];
        long[] cycleSum = new long[N];
        long ans = -10000000000L;
        for (int n = 0; n < N; n++) {
            if (cycle[n] == 0) {
                Set<Integer> set = new HashSet<>();
                long sum = 0;
                for (int c = n; set.add(c); c = P[c])
                    sum += C[c];
                for (int c : set) {
                    cycle[c] = set.size();
                    cycleSum[c] = sum;
                }
            }
            long score = 0;
            int k = 0;
            if (cycleSum[n] <= 0) {
                k = cycle[n];
            } else if (K < cycle[n] * 2) {
                k = K;
            } else {
                score = (K / cycle[n] - 1) * cycleSum[n];
                k = K % cycle[n] + cycle[n];
            }
            long max = -10000000000L;
            for (int i = 0, c = n; i < k; i++) {
                c = P[c];
                score += C[c];
                max = Math.max(max, score);
            }
            ans = Math.max(ans, max);
        }
        out.println(ans);

        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
