import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long sum = 0;
        ArrayList<Integer> ret = new ArrayList<>();
        if (n == 3) {
            ret.add(2); ret.add(5); ret.add(63);
        } else if (n < 14990) {
            for (int i = 1; i <= n - 3; i++) {
                ret.add(2 * i);
                sum += 2 * i;
            }
            int cur = 2 * (n - 3) + 2;
            while ((cur + sum) % 3 != 0) cur += 2;
            ret.add(cur);
            ret.add(3);
            ret.add(9);
        } else {
            for (int i = 3; i <= 30000; i += 6) ret.add(i);
            if (ret.size() % 2 != 0) ret.remove(ret.size() - 1);
            int curSz = ret.size(); int add = 2;
            for (int i = curSz + 1; i <= n - 1; i++) {
                ret.add(add); sum += add;
                add += 2;
            }
            while ((sum + add) % 3 != 0) add += 2;
            ret.add(add);
        }
        for (Integer i : ret) out.print(i + " ");
        //out.println();
        //out.println(ret.size());
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