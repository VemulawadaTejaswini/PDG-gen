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
            String a = in.next();
            String b = in.next();

            for(int i=0;i<b.length();i++){
                String c = b.substring(i);
                c += b.substring(0,i);
                if(a.equals(c)){
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
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
