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
            long k = in.nextLong();
            int[] a = new int[100];
            long[] d = new long[n];
            for(int i=0;i<n;i++){
                long x = in.nextLong();
                d[i] = x;
                int j=0;
                while(x!=0){
                    a[j] += (int)(x&1);
                    x=x>>1;
                    j++;
                }
            }
//            System.out.println(Arrays.toString(a));
            String s = "";
            int j=0;
            while (true){
                if(a[j]>=((n+1)/2)){
                    s="0"+s;
                }else{
                    s="1"+s;
                }
                if(Long.parseLong(s,2)>k){
                    s = s.substring(1);
                    break;
                }
                j++;
//                System.out.println(s);
            }
            long x;
            if(s.equals("")){
                x = 0;
            }else{
                x = Long.parseLong(s,2);
            }

//            System.out.println(x);
            long ans = 0;

            for(long f:d){
                ans+=f^x;
            }
            System.out.println(ans);
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