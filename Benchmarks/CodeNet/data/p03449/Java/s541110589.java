import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int a[][] = new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        int ans = 0;
        int t[] = new int[n];
        int b[] = new int[n];
        t[0] = a[0][0];
        for(int i=1;i<n;i++){
            t[i] = t[i-1] + a[0][i];
        }
        b[n-1] = a[1][n-1];
        for(int j = n-2;j>=0;j--){
            b[j] = b[j+1] + a[1][j];
        }
        for(int i=0;i<n;i++){
            ans = Math.max(ans,t[i]+b[i]);
        }
        System.out.println(ans);
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
}
