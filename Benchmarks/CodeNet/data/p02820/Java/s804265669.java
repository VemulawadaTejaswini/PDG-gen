import java.io.*;
import java.util.*;
import java.math.*;
 
class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st, st2;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1, 0};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1, 0};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] won = new boolean[N];
        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        long ans = 0;

        char[] A = br.readLine().toCharArray();
        for (int i = 0; i < N; i++) {
            if (i < K || A[i] != A[i-K] || !won[i-K]) {
                won[i] = true;
                if (A[i] == 'r') {
                    ans += P;
                } else if (A[i] == 's') {
                    ans += R;
                } else {
                    ans += S;
                }
            }
        }

        pw.println(ans);

        pw.close();
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int a, b;

    Pair(int _a, int _b){
        a = _a;
        b = _b;
    }
 
    public String toString(){
        return a + " " + b;
    }

    public int compareTo(Pair p){
        if (b != p.b) return b < p.b ? -1 : 1;
        if (a != p.a) return a < p.a ? -1 : 1;
        return 0;
    }
}