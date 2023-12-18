import java.io.*;
import java.util.*;
import java.math.*;
 
class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1, 0};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1, 0};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long[] A = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Long, Integer> d = new HashMap<Long, Integer>();

        long ans = 0;
        for (int i = 0; i < N; i++) {
            // System.out.println(d);
            if (d.containsKey(-A[i])) {
                ans += d.get(-A[i]);
            }
            HashMap<Long, Integer> d2 = new HashMap<Long, Integer>();
            for (long v : d.keySet()) {
                long v2 = v + A[i];
                if (d2.containsKey(v2)) {
                    d2.put(v2, d2.get(v2) + d.get(v));
                } else {
                    d2.put(v2, d.get(v));
                }
            }
            // System.out.println(d2);      
            d = d2;
            if (d.containsKey(A[i])) {
                d.put(A[i], d.get(A[i]) + 1);
            } else {
                d.put(A[i], 1);
            }

        }

        pw.println(ans);
        
        pw.close(); 
        br.close();
    }
}

class Point implements Comparable<Point>{
    public int x, y;
 
    Point(int _x, int _y){
        x = _x;
        y = _y;
    }
 
    public String toString(){
        return x + " " + y;
    }

    public int compareTo(Point p){
        if (x != p.x) return x < p.x ? -1 : 1;
        if (y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
} 
