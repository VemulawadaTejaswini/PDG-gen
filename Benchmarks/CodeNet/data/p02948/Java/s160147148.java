import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        final int MOD = 1000000007;

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer>[] arr = new ArrayList[m];
        for(int i=0;i<m;i++) arr[i] = new ArrayList<>();

        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(m - a >= 0) {
                arr[m-a].add(b);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long ans = 0;
        for(int i=m-1;i>=0;i--) {
            for(int x : arr[i]) {
                pq.add(x);
            }
            if(!pq.isEmpty()) {
                ans += pq.poll();
            }
        }

        pw.println(ans);
        pw.close();
    }
}
