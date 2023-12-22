import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    //Fast Reader
    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public void resetST() {
            st = null;
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

        public float nextFloat() {
            return Float.parseFloat(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            st = null;
            return str;
        }

        public int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public double[] nextDoubleArray(int size) {
            double[] arr = new double[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter pr = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long mod = (long) (Math.pow(10, 9) + 7);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum1 = 1;
        long sum2 = 1;
        for (int i = 0; i < k; i++) {
            sum1 = sum1 * arr[i] % mod;
            sum1 = sum1 % mod;
        }

        for (int i = n - 1; i > n - 1 - k; i--) {
            sum2 = sum2 * arr[i] % mod;
            sum2 = sum2 % mod;
        }
        if (sum1 > sum2)
        {
            if (sum1<0)
            {
                pr.println(mod+sum1);
            }
            else
            {
                pr.println(sum1);
            }
        }
        else {

            if (sum2<0)
            {
                pr.println(mod+sum2);
            }
            else
            {
                pr.println(sum2);
            }
        }
        pr.close();
        // write your code here
    }
}
