import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        ArrayList<Pair> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++) list.add(new Pair(scanner.nextInt(),i));
        Collections.sort(list, Collections.reverseOrder());
        long ans = 0;
        TreeSet<Integer> indices = new TreeSet<>();
        indices.add(list.get(0).b);
        indices.add(n);
        indices.add(-1);
        for(int i =1; i < n; i++) {
            int ind = list.get(i).b;
            int above = indices.ceiling(ind);
            int below = indices.floor(ind);
            if (above != n) {
                int next = indices.ceiling(above+1);
                ans += (long)(ind - below) * (long)(next - above) * list.get(i).a;
            }
            if (below != -1) {
                int next = indices.floor(below - 1);
                ans += (long)(below - next) * (long)(above - ind) * (long) list.get(i).a;
            }
            indices.add(list.get(i).b);
        }
        out.println(ans);
        out.flush();
    }
    static class Pair implements Comparable<Pair> {
        int a,b;
        Pair(int aa, int bb) {
            a = aa; b = bb;
        }
        public int compareTo(Pair o) {
            return a - o.a;
        }
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
