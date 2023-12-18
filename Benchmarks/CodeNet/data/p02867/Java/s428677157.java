import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        int[] a = new int[n], aa = new int[n], b = new int[n], bb = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            aa[i] = a[i];
        }
        for(int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            bb[i] = b[i];
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        //viability check after sorting
        for(int i = 0; i < n; i++) {
            if (aa[i] > bb[i]) {
                System.out.println("No");
                return;
            }
        }
        //whether we can do this with n-2 naive swaps
        for(int i = 1; i < n; i++) {
            if (aa[i] <= bb[i-1]) {
                System.out.println("Yes");
                return;
            }
        }
        //create a mapping of the sorted elts into 1...n
        HashMap<Integer, Integer> mapb = new HashMap<>();
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mapa.put(a[i], i);
            mapb.put(b[i], i);
        }
        //get the permutation compared the what is needed for b;
        int[] perm = new int[n];
        for(int i = 0; i < n; i++) {
            perm[mapb.get(b[i])] = mapa.get(a[i]);
        }
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if (vis[i]) continue;
            int cur = i;
            do {
                vis[cur] = true;
                cur = perm[cur];
            } while(!vis[cur]);
            cnt++;
        }
        //issue if all in one cycle, would require n-1 swaps
        if (cnt == 1) System.out.println("No");
        else System.out.println("Yes");
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
