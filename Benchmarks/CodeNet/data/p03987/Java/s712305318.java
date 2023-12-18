import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[sc.nextInt()] = i;
        TreeSet<Integer> set = new TreeSet<>();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int idx = a[i];
            int lo = 1; int hi = n;
            if (set.lower(idx) != null) lo = set.lower(idx) + 1;
            if (set.higher(idx) != null) hi = set.higher(idx) - 1;
            ans = (ans + ((long) idx - lo + 1) * ((long) hi - idx + 1) * i);
            set.add(idx);
        }
        out.println(ans);
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