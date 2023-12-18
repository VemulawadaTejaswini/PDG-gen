import java.util.*;
import java.io.*;

public class Main {
    static int[] ans;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int[] dams = new int[N];
        for(int i = 0; i < N; i++) {
            dams[i] = scanner.nextInt();
        }
        ans = new int[N];
        int lo = 1;
        int hi = dams[0];
        while(lo <= hi) {
            int mid = (lo + hi)/2;
            if (check(mid, Arrays.copyOf(dams, N))) hi = mid-1;
            else lo = mid + 1;
        }
        check(lo-1, dams);
        out.print(2*ans[N-1]);
        for(int i = 0; i < N-1; i++) {
            out.print(" " + 2*ans[i]);
        }
        out.println();
        out.flush();
    }
    
    static boolean check(int mid, int[] dams) {
        dams[0] -= mid;
        dams[1] -= mid;
        int N = dams.length;
        ans[0] = mid;
        for(int i = 1; i < N; i++) {
            ans[i] = dams[i];
            dams[(i+1)%N] -= ans[i];
        }
        return dams[0] < 0;
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
