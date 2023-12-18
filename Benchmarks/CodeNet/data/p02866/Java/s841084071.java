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
        int[] cnt = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (i == 0 && n != 0) {
                pw.println(0);
                pw.close(); 
                return;
            } 
            cnt[n]++;
        }

        if (cnt[0] != 1) {
            pw.println(0);
            pw.close();
        }
        // System.out.println(Arrays.toString(cnt));
        long ans = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                ans = (ans * cnt[i-1]) % 998244353;
            }
        }
        pw.println(ans);
        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int x;
    public int y;

    Pair(int _x, int _y){
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