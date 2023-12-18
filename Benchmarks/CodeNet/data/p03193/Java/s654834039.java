import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class pair {
        int a, b;

        pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

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

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        int n=in.nextInt(),h=in.nextInt(),w=in.nextInt();
        int mat[][]=new int[n][2];
        long ans=0;
        for (int i = 0; i < mat.length; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            mat[i][0]=a;
            mat[i][1]=b;
            ans+=Math.min(a/h,b/w);
        }
        System.out.println(ans);

    }
}