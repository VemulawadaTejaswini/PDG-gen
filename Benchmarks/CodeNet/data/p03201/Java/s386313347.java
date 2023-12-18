import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        Long [] a = new Long[n];
        TreeMap<Long, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int res = 0;
        while (!map.isEmpty()) {
            Long x = map.firstKey();
            long rem = (Long.highestOneBit(x) << 1) - x;
            if (map.containsKey(rem) && rem == x) {
                res += map.get(x) / 2;
                map.remove(x);
            } else if (map.containsKey(rem)) {
                map.put(rem, map.get(rem) - 1);
                if (map.get(rem) == 0) map.remove(rem);
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0) map.remove(x);
                ++res;
            } else {
                map.remove(x);
            }
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