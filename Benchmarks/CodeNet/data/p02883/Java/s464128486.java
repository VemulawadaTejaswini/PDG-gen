import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    static int N;
    static long K;
    static Integer[] A;
    static Integer[] F;
    public static boolean isOK(long index) {
        long sum = K;
        int flag = 0;
        for (int i=0;i<N;i++) {
            if (index<F[i]*A[i]) {
                sum -= Math.ceil((double)(F[i]*A[i]-index)/F[i]);
            }
            if (sum<0) {
                flag = 1;
                break;
            }
        }
        if (flag==0) return true;
        // if (a[index] >= key) return true;
        else return false;
    }

    public static long binary_search() {
        long left = -1L;
        long right = 9223372036854775807L-1000000000L;

        while (right - left > 1) {
            long mid = left + (right - left) / 2;

            if (isOK(mid)) right = mid;
            else left = mid;
        }
        return right;
    }
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        };

        N = in.nextInt();
        K = in.nextLong();
        A = new Integer[N];
        F = new Integer[N];
        for (int i=0;i<N;i++) {
            A[i] = in.nextInt();
        }
        for (int i=0;i<N;i++) {
            F[i] = in.nextInt();
        }
        Arrays.sort(A, comparator);
        Arrays.sort(F);

        out.println(binary_search());

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

    }
}
