import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        PrintWriter pr = new PrintWriter(System.out);
        long n =sc.nextInt();
        long k=n%1000;
        if(k==0)
        {
            pr.println("0");
        }
        else
        {
            pr.println(1000-k);
        }
        pr.close();
	// write your code here
    }
}
