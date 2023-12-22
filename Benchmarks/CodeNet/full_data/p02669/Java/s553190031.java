import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            long N = in.nextLong();
            long A = in.nextLong();
            long B = in.nextLong();
            long C = in.nextLong();
            long D = in.nextLong();

            Map<Long, Long> cost = new HashMap<>();
            cost.put(0L, Long.MAX_VALUE);
            cost.put(N, 0L);
            while (true) {
                Map<Long, Long> next = new HashMap<>();
                for (long n : cost.keySet()) {
                    if (n == 0) {
                        next.put(0L, Math.min(next.getOrDefault(0L, Long.MAX_VALUE), cost.get(0L)));
                    } else if (n == 1) {
                        next.put(0L, Math.min(next.getOrDefault(0L, Long.MAX_VALUE), cost.get(1L) + D));
                    } else {
                        try {
                            long l = cost.get(n) + Math.multiplyExact(n, D);
                            if (l > 0) next.put(0L, Math.min(next.getOrDefault(0L, Long.MAX_VALUE), l));
                        } catch (Exception e) { }
                        for (int i = -1; i < 2; i++) if ((n + i) % 2 == 0) {
                            try {
                                long l = cost.get(n) + A + Math.abs(i) * D;
                                if (l > 0) next.put((n + i) / 2, Math.min(next.getOrDefault((n + i) / 2, Long.MAX_VALUE), l));
                            } catch (Exception e) { }
                        }
                        for (int i = -2; i < 3; i++) if ((n + i) % 3 == 0) {
                            try {
                                long l = cost.get(n) + B + Math.abs(i) * D;
                                if (l > 0) next.put((n + i) / 3, Math.min(next.getOrDefault((n + i) / 3, Long.MAX_VALUE), l));
                            } catch (Exception e) { }
                        }
                        for (int i = -4; i < 5; i++) if ((n + i) % 5 == 0) {
                            try {
                                long l = cost.get(n) + C + Math.abs(i) * D;
                                if (l > 0) next.put((n + i) / 5, Math.min(next.getOrDefault((n + i) / 5, Long.MAX_VALUE), l));
                            } catch (Exception e) { }
                        }
                    }
                }
                cost = next;
                for (long l : cost.keySet())
                    System.out.println(l + " " + cost.get(l));
                System.out.println();
                if (cost.size() == 1)
                    break;
            }
            out.println(cost.get(0L));
        }
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

