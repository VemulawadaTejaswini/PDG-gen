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
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        long ans = 0;
        if (A + 1 < B) {
            K -= (A - 1);
            ans += A;
            if (K > 0) {
                int times = K / 2;
                ans += times * ((long)B - A);
                K -= times * 2; 
            }
        }
        ans += K;

        pw.println(Math.max(K+1, ans));

        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public long x;
    public int y;
 
    Pair(long _x, int _y){
        x = _x;
        y = _y;
    }
 
    public String toString(){
        return x + " " + y;
    }

    public int compareTo(Pair p){
        if (x != p.x) return x < p.x ? -1 : 1;
        if (y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
} 