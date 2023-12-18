import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int k = sc.nextInt(); int c = sc.nextInt();
        String s = sc.next();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) if (s.charAt(i) == 'x') a[i] = 1;
        int [] l = new int[k + 1];
        int [] r = new int[k + 1];
        for (int i = 0, j = 1; i < n; ) {
            if (a[i] == 1) i++;
            else {
                if (j <= k) l[j] = i;
                i += c + 1; j++;
            }
        }
        for (int i = n - 1, j = k; i >= 0; ) {
            if (a[i] == 1) i--;
            else {
                if (j >= 0) r[j] = i;
                i -= (c + 1); j--;
            }
        }
        for (int i = 1; i <= k; i++) if (l[i] == r[i]) out.println((l[i] + 1));
        out.close();
    }


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
                } catch (IOException e) {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}