import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int x;
        int y;
        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[h+1];
            int[] b = new int[w+1];
            Point[] p = new Point[m];
            for(int i=0 ; i<m ; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                p[i] = new Point(u, v);
                a[u]++;
                b[v]++;
            }

            int max = 0;
            for(int i=0 ; i<=h ; i++) {
                max = Math.max(max, a[i]);
            }
            HashSet<Integer> hor = new HashSet<>();
            for(int i=0 ; i<=h  ;i++) {
                if(max == a[i]) hor.add(i);
            }

            int f1 = max;

            max = 0;
            for(int i=0 ; i<=w ; i++) {
                max = Math.max(max, b[i]);
            }
            HashSet<Integer> ver = new HashSet<>();
            for(int i=0 ; i<=w  ;i++) {
                if(max == b[i]) ver.add(i);
            }

            int f2 = max;

            long poss = (long)hor.size()*ver.size();
            long cut = 0;
            for(int i=0 ; i<m ; i++) {
                if(hor.contains(p[i].x) && ver.contains(p[i].y)) {
                    cut++;
                }
            }

            if(cut == poss) {
                pw.println(f1 + f2 - 1);
            }
            else {
                pw.println(f1 + f2);
            }

        }
        finally {
            pw.flush();
            pw.close();
        }
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
