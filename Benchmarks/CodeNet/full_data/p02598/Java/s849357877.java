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
        List<Log> list = new ArrayList<>();
        long sum = 0;
        for (int n = 0; n < N; n++) {
            int i = in.nextInt();
            list.add(new Log(i));
            sum += i;
        }
        int k = 0;
        int ave = (int) (sum / Math.max(K, 1));
        TreeSet<Log> set = new TreeSet<>();
        for (Log log : list) {
            int d = Math.max(1, log.A / ave);
            log.D = d;
            set.add(log);
            k += d - 1;
        }
        for (; k < K; k++) {
            Log log = set.pollFirst();
            if (log.length() == 1) {
                set.add(log);
                break;
            }
            log.D++;
            set.add(log);
        }
        out.println(set.first().length());

        out.flush();
    }

    static class Log implements Comparable<Log> {
        int A, D;
        Log (int A) {
            this.A = A;
            D = 1;
        }
        int length() {
            return 1 + (A - 1) / D;
        }
        @Override
        public int compareTo(Log o) {
            if (o.length() == length())
                return 1;
            return o.length() - length();
        }
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

