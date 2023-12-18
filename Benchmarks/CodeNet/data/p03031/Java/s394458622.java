import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int flags[] = new int[M];

        for (int i=0;i<M;i++) {
            int flag = 0;
            int k = sc.nextInt();
            for (int j=0;j<k;j++) {
                int s = sc.nextInt();
                flag |= 1 << s;
            }

            flags[i] = flag;
        }

        for (int i=0;i<M;i++) {
            int p = sc.nextInt();
            flags[i] |= p;
        }

        int ans = 0;
        int max = 1 << N;
        for (int i=0;i<max;i++) {
            int sw = (i << 1) | (1);
            boolean is_ok = true;
            for (int j=0;j<M;j++) {
                if (Integer.bitCount(sw & flags[j]) % 2 != 0) {
                    is_ok = false;
                    break;
                }
            }

            if (is_ok) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
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
}