import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int x = sc.nextInt();
        if (x == 1 || x == 2 * n - 1) {
            out.println("No");
        } else {
            out.println("Yes");
            int [] ret = new int [2 * n - 1];
            Set<Integer> used = new HashSet<>();
            used.add(x); used.add(x + 1); used.add(x - 1);
            ret[n - 1] = x;
            ret[n] = x + 1;
            ret[n - 2] = x - 1;
            if (n >= 3) {
                if (x > 2) {
                    ret[n + 1] = x - 2;
                    used.add(x - 2);
                } else {
                    ret[n - 3] = x + 2;
                    used.add(x + 2);
                }
            }
            int idx = 1;
            for (int i = 0; i < ret.length; i++) {
                if (ret[i] == 0) {
                    while (used.contains(idx)) idx++;
                    ret[i] = idx;
                    idx++;
                }
            }
            for (int i = 0; i < ret.length; i++) out.println(ret[i]);
        }
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