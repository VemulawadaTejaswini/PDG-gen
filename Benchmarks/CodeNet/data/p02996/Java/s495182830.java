import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        Pair[] jobs = new Pair[N];
        for(int i = 0; i < N; i++) {
            jobs[i] = new Pair(scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(jobs);
        int cnt = 0;
        int curTime = 0;
        for(int i = 0; i < N; i++) {
            if (curTime + jobs[i].a > jobs[i].b) break;
            cnt++;
            curTime += jobs[i].a;
        }
        if (cnt == N) out.println("Yes");
        else out.println("No");
        out.flush();
    }
    
    static class Pair implements Comparable<Pair> {
        int a, b;
        public Pair(int aa, int bb) {
            a = aa; b = bb;
        }
        public int compareTo(Pair o) {
            if (b == o.b) return a - o.a;
            return b - o.b;
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
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
