	import java.util.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

    static FastReader sc = new FastReader();
    static final double E = 0.000000001;
    static final long MOD = (long) (1e9 + 7);
    static final long MAX = (long)1e9 ;

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        while(n-- > 0)
        {
            if(sc.nextInt() >= k)
                res++;
        }
        System.out.println(res);

    }


}
