import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) A[i] = scanner.nextInt();
        int[] cnts = new int[200001];
        int max = -1;
        for(int i = 0; i < N; i++) {
            cnts[A[i]]++;
            max = Math.max(max, A[i]);
        }
        for(int i = 0; i < N; i++) {
            if (A[i] < max) out.println(max);
            if (A[i] == max) {
                if (cnts[A[i]] > 1)
                    out.println(max);
                else {
                    for(int j = max-1; j>= 0; j--) {
                        if (cnts[j] > 0) {
                            out.println(j);
                            break;
                        }
                    }
                }
            }
            
        }
        out.flush();
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
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
