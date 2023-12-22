

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N = 100;
    static int INFTY = 1 << 21;
    static int n;
    static int[][] M = new int[N][N];
    static int[] d = new int[N];

    public static void bfs(int s) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        for(int i = 0; i < n; i++) d[i] = INFTY;
        d[s] = 0;
        int u;
        while(!q.isEmpty()) {
            u = q.poll();
            for(int v = 0; v < n; v++) {
                if(M[u][v] == 0) continue;
                if(d[v] != INFTY) continue;
                d[v] = d[u] + 1;
                q.add(v);
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1 + " " + ((d[i] == INFTY) ? (-1) : d[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, k, v;
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) M[i][j] = 0;
        }
        for(int i = 0; i < n; i++) {
            u = sc.nextInt();
            k = sc.nextInt();
            u--;
            for(int j = 0; j < k; j++) {
                v = sc.nextInt();
                v--;
                M[u][v] = 1;
            }
        }
        bfs(0);
    }
}

