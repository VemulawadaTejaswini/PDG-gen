import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = new int[n + 1];
        f = new int[n + 1];
        m = new int[n + 1][n + 1];
        color = new int[n + 1];
        for(int i = 1 ; i <= n ; i ++){
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j = 1; j <= k ; j ++){
                int v = sc.nextInt();
                m[u][v] = 1;
            }
        }

        for(int i = 1; i <= n ; i ++){
            if(color[i] == 0){
                dfs2(i);
            }
        }

        for(int i = 1; i <= n ; i ++){
            System.out.println(i + " " + d[i] + " " + f[i]);
        }
    }
    static Stack<Integer> s = new Stack<>();
    static int[] d;
    static int[] f;
    static int[][] m;
    static int[] color;
    static int time = 0;
    static int n;

    static void dfs2(int u){
        d[u] = ++ time;
        color[u] = 1;
        for(int i = 1; i <= n ; i++){
            if(m[u][i] == 1 && color[i] == 0){
                dfs2(i);
            }
        }
        color[u] = 2;
        f[u] = ++ time;
    }
}
