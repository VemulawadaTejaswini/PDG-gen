import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = fs.nextInt();
        String S = fs.readNextLine();
        int l = 0;
        int r = n - 1;
        int m = 0;
        for (int i = 0; i < 13;i++){
            m = (int) ((l + r - 1) / 2);
            if (can(S, n, m)){
                l = m;
            }else{
                r = m;
            }
        }
        pw.println(l);
        pw.flush();
    }

    public static boolean can(String S, int N, int m){
        for(int j=0;j < N - 2*m + 1; j++) {
            for (int k = j + m; k < N - m + 1; k++) {
                if (S.substring(j, j + m).equals(S.substring(k, k + m))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner() {
            this(new InputStreamReader(System.in));
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

        String readNextLine() {
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
