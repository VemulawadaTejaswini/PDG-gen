import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] p = new int[n];
        int [] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            a[p[i]] = i;
        }
        TreeSet<Integer> set = new TreeSet<>();
        long res = 0;
        for (int i = n; i >= 1; i--) {
            int idx = a[i];
            if (i == n) {
                set.add(idx);
                continue;
            }
            Integer lower = set.lower(idx);
            Integer higher = set.higher(idx);
            if (lower == null) {
                Integer above = (set.higher(higher) == null ? n - 1 : set.higher(higher) - 1);
                res += ((long) above - higher + 1) * (idx + 1) * i;
                set.add(idx);
                continue;
            } else if (higher == null) {
                Integer below = (set.lower(lower) == null ? 0 : set.lower(lower) + 1);
                res += ((long)lower - below + 1) * (n - idx) * i;
                set.add(idx);
                continue;
            }
            Integer below = (set.lower(lower) == null ? 0 : set.lower(lower) + 1);
            Integer above = (set.higher(higher) == null ? n - 1 : set.higher(higher) - 1);
            res = res + ((long) idx - (lower + 1) + 1) * (above - higher + 1) * i;
            res = res + ((long) (higher - 1) - idx + 1) * (lower - below + 1) * i;
            set.add(idx);
        }
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