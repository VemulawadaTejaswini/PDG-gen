
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int N = 100;
    public static int[][] M = new int[N][N];
    public static int INF = 10000007;
    public static int NIL = -1;
    public static int WHITE = 0;
    public static int GRAY = 1;
    public static int BLACK = 2;

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int d = sc.nextInt();
                if(d == -1) M[i][j] = INF;
                else M[i][j] = d;
            }
        }

        //??????
        System.out.println(prim());
    }

    public static int prim() {
        int[] color = new int[n];
        int[] d = new int[n];
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            color[i] = WHITE;
            d[i] = INF;
        }
        d[0] = 0;
        p[0] = NIL;

        while(true) {
            int mincost = INF;
            int u = 0;
            for(int i = 0; i < n; i++) {
                if(color[i] != BLACK && d[i] < mincost) {
                    mincost = d[i];
                    u = i;
                }
            }
            if(mincost == INF) break;
            color[u] = BLACK;
            for(int i = 0; i < n; i++) {
                if(color[i] != BLACK && M[u][i] < d[i]) {
                    d[i] = M[u][i];
                    color[i] = GRAY;
                    p[i] = u;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(p[i] != NIL) ans += M[i][p[i]];
        }
        return ans;
    }



}