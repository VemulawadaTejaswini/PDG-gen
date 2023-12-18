import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n-1];
        for(int i = 0; i < n; i++) for(int j = 0; j <n-1; j++) arr[i][j] = scanner.nextInt()-1;
        int ans = 0;
        boolean changed = true;
        int[] ptr = new int[n];
        boolean[] did = new boolean[n];
        while(changed) {
            changed = false;
            Arrays.fill(did, false);
            for(int i = 0; i <n; i++) {
                if (did[i] || ptr[i] == n-1) continue;
                int opp = arr[i][ptr[i]];
                if (ptr[opp] == n-1 || did[opp]) continue;
                if (arr[opp][ptr[opp]] == i) {
                    did[i] = true;
                    did[opp] = true;
                    ptr[opp]++;
                    ptr[i]++;
                    changed = true;
                }
            }
            if (changed) ans++;
        }
        boolean good = true;
        for(int i = 0; i < n; i++) {
            if (ptr[i] != n-1) good = false;
        }
        if (good) out.println(ans);
        else out.println(-1);
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
    }
}
