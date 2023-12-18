import java.util.*;
import java.io.*;
//atcoder
public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        if (R-L>= 2019) out.println(0);
        else {
            ArrayList<Integer> vals = new ArrayList<>();
            for(int i = L; i <= R; i++) {
                vals.add(i % 2019);
            }
            int ans = 2019;
            for(int i = 0; i < vals.size(); i++) {
                for(int j = i + 1; j < vals.size(); j++) {
                    ans = Math.min(ans, (int)vals.get(i)*(int)vals.get(j) % 2019);
                }
            }
            out.println(ans);
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
