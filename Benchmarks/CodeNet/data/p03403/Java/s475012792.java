import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        FastReader in = new FastReader();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        Task.solve(in, out);
        out.close();
    }

    static class Task {

        public static void solve(FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int cost =0;
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
                if(i!=0){
                    cost += Math.abs(a[i]-a[i-1]);
                }
            }
            cost += Math.abs(a[0]);
            cost += Math.abs(a[n-1]);
            out.println(cost - Math.abs(a[0]) - Math.abs(a[0]-a[1]) + Math.abs(a[1]));
            for(int i=1;i<n-1;i++){
                out.println(cost - Math.abs(a[i]-a[i-1]) - Math.abs(a[i]-a[i+1]) + Math.abs(a[i-1] - a[i+1]));
            }
            out.println(cost - Math.abs(a[n-1]-a[n-2]) - Math.abs(a[n-1]) + Math.abs(a[n-2]));

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
}
