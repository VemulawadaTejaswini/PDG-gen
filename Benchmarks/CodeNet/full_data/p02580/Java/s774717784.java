import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastReader s=new FastReader();
        int h = s.nextInt();
        int w = s.nextInt();
        int m = s.nextInt();
        
        Map<Integer, Integer> xc = new HashMap<Integer, Integer>();
        Map<Integer, Integer> yc = new HashMap<Integer, Integer>();
        // Set<String> b = new HashSet<>();
        int mx = 0;
        int my = 0;
        // boolean[][] b = new boolean[h][w];
        Map<Integer, Set<Integer>> b =  new HashMap<>();

        for(int i=0; i<m; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if(!xc.containsKey(x)) xc.put(x, 0);
            if(!yc.containsKey(y)) yc.put(y, 0);
            xc.put(x, xc.get(x)+1);
            mx = Math.max(mx, xc.get(x));
            yc.put(y, yc.get(y)+1);
            my = Math.max(my, yc.get(y));
            // if(mx==xc.get(x) || my==yc.get(y))
            // b.add(getString(x, y));
            // b[x-1][y-1] = true;
            if(!b.containsKey(x)) b.put(x, new HashSet<>());
            b.get(x).add(y);
        }


       
        for(int x : xc.keySet()) {
            if(xc.get(x)<mx) continue;
            for(int y : yc.keySet()) {
                if(yc.get(y)<my) continue;
                if(!b.containsKey(x) || !b.get(x).contains(y)) {
                    System.out.println(mx+my);
                    return;
                }                
            }
        }
        System.out.println(mx+my-1);
    }

    // private static String getString(int x, int y) {
    //     return Integer.toString(x) + "." + Integer.toString(y);
    // }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (final IOException  e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (final IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}