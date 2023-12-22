import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();
        long K = in.nextInt();
        int[] A = new int[N];
        for (int n = 0; n < N; n++)
            A[n] = in.nextInt();
        int[] B = new int[M];
        for (int m = 0; m < M; m++)
            B[m] = in.nextInt();

        long[] sumA = new long[N];
        sumA[0] = A[0];
        for (int n = 1; n < N; n++)
            sumA[n] = sumA[n - 1] + A[n];
        long[] sumB = new long[M];
        sumB[0] = B[0];
        for (int m = 1; m < M; m++)
            sumB[m] = sumB[m - 1] + B[m];
        int ans = M;
        while (sumB[ans - 1] > K) {
            ans--;
            if (ans == 0) break;
        }
        for (int ia = 0, ib = ans - 1; ia < N; ia++) {
            while (ib >= 0 && sumA[ia] + sumB[ib] > K) {
                ib--;
                if (ib == -1) break;
            }
            if (ib == -1) {
                if (sumA[ia] <= K)
                    ans = Math.max(ans, ia + 1);
            } else {
                ans = Math.max(ans, ia + 1 + ib + 1);
            }
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

