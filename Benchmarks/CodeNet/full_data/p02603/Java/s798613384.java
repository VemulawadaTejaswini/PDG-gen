import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner scn = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Solution Start

        // D-Road to Millionaire
        int n = scn.nextInt();
        int m = 1000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int stocks = 0;
        for (int i = 0; i < (n - 1); i++) {
            if (a[i] < a[i + 1]) stocks = m / a[i];
            m += (a[i + 1] - a[i]) * stocks;
        }
        out.println(m);
        /*
        // C-Marks
        int n = scn.nextInt();
        int[] a = new int[n];
        int k = scn.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        for (int i = k; i < n; i++) {
            if (a[i] > a[i - k]) out.println("Yes");
            else out.println("No");
        }
        */
        //Solution end
        out.close();
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}
