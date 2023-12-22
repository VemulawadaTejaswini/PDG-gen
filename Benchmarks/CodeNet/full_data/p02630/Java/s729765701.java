import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] A = new int[N];
        for (int n = 0; n < N; n++)
            A[n] = in.nextInt();
        int Q = in.nextInt();
        int[] B = new int[Q];
        int[] C = new int[Q];
        for (int q = 0; q < Q; q++) {
            B[q] = in.nextInt();
            C[q] = in.nextInt();
        }

        Map<Integer, Integer> count = new HashMap<>();
        long sum = 0;
        for (int n = 0; n < N; n++) {
            count.put(A[n], count.getOrDefault(A[n], 0) + 1);
            sum += A[n];
        }
        for (int q = 0; q < Q; q++) {
            int c = count.getOrDefault(B[q], 0);
            sum += (long) c * (C[q] - B[q]);
            count.put(B[q], 0);
            count.put(C[q], count.getOrDefault(C[q], 0) + c);
            out.println(sum);
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

