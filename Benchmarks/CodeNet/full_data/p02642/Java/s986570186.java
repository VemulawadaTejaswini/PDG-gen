import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt();
//        N = 200_000;


        boolean[] seen = new boolean[1000_002];
        Set<Integer> a = new ConcurrentSkipListSet<>();

        Set<Integer> toRemove = new TreeSet<>();

        for (int i = 0; i < N; ++i) {
            int x = fs.nextInt();
//            int x = i + 1;
            if (a.contains(x)) {
                toRemove.add(x);
            }
            a.add(x);
            seen[x] = false;
        }


        for (Iterator<Integer> it = a.iterator(); it.hasNext(); ) {
            int num = it.next();
            if (seen[num]) {
                continue;
            }
            seen[num] = true;
            int start = num;
            for (int j = start + num; j <= 1000_001; j += num) {
                if (a.contains(j)) {
                    a.remove(j);
                }
            }
        }

        for (int el: toRemove) {
            a.remove(el);
        }


        System.out.println(a.size());
   }
}
