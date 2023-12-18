import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int k = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < k; i++) set.add(a[i]);
        int res = 1;
        for (int i = k; i < n; i++) {
            if (set.first() != a[i - k] || a[i] < set.last()) ++res;
            set.remove(a[i - k]); set.add(a[i]);
        }
        ArrayList<Integer> run = new ArrayList<>();
        int cur = 0; int prev = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > prev) {
                cur++;
            } else {
                run.add(cur);
                cur = 1;
            }
            prev = a[i];
        }
        run.add(cur);
        boolean ok = false;
        for (Integer i: run) {
            res--;
            if (i >= k) ok = true;
        }
        if (ok) ++res;
        out.println(res);
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