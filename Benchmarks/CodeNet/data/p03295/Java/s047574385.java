import java.util.*;
import java.io.*;

public class Main {

    /************************ SOLUTION STARTS HERE ************************/

    static int n, m;

    private static void solve() {

        n = nextInt();
        m = nextInt();

        List<Custom> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            int a, b;
            a = nextInt();
            b = nextInt();

            arr.add(new Custom(a, 0));
            arr.add(new Custom(b, 1));
        }

        arr.sort((a, b) -> {
            if (a.a > b.a) {
                return 1;
            } else if (a.a == b.a) {

                // IN should come first ?
                if (a.b > b.b) {
                    return -1;
                } else {
                    return 1;
                }

            } else {
                return -1; // don't swap
            }
        });


        out.println(0);

        // int ans = 0;
        // int insert_counter = 0;

        // for (Custom i : arr) {

        //     if (i.b == 0) {
        //         // insert elem
        //         insert_counter++;
                
        //     } else if (i.b == 1) {
        //         // increment answer and empty the queue
        //         if (insert_counter != 0) {
        //             ans++;
        //             insert_counter = 0;
        //         }
        //     }
        // }

        // println(ans);

    }

    public static class Custom {
        public int a, b;

        public Custom(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Custom custom = (Custom) o;

            if (a != custom.a) return false;
            return b == custom.b;
        }

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            return result;
        }

        @Override
        public String toString() {
            return "Custom{" +
            "a=" + a +
            ", b=" + b +
            '}';
        }
    }


    /************************ SOLUTION ENDS HERE ************************/


    /************************ TEMPLATE STARTS HERE **********************/

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        st = null;
        solve();
        reader.close();
        writer.close();
    }

    static BufferedReader reader;
    static PrintWriter writer;
    static StringTokenizer st;

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = reader.readLine();
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
        return st.nextToken();
    }

    static String nextLine() {
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static long nextLong() {
        return Long.parseLong(next());
    }

    static double nextDouble() {
        return Double.parseDouble(next());
    }

    static char nextChar() {
        return next().charAt(0);
    }

    static int[] nextIntArray(int n) {
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            a[i++] = nextInt();
        }
        return a;
    }

    static long[] nextLongArray(int n) {
        long[] a = new long[n];
        int i = 0;
        while (i < n) {
            a[i++] = nextLong();
        }
        return a;
    }

    static int[] nextIntArrayOneBased(int n) {
        int[] a = new int[n + 1];
        int i = 1;
        while (i <= n) {
            a[i++] = nextInt();
        }
        return a;
    }

    static long[] nextLongArrayOneBased(int n) {
        long[] a = new long[n + 1];
        int i = 1;
        while (i <= n) {
            a[i++] = nextLong();
        }
        return a;
    }

    static void print(Object o) {
        writer.print(o);
    }

    static void println(Object o) {
        writer.println(o);
    }

    /************************ TEMPLATE ENDS HERE ************************/

}


