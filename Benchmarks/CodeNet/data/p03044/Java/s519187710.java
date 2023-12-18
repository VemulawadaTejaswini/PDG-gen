import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int n;
    static int u[];
    static int v[];
    static String w[];

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        u = new int[n];
        v = new int[n];
        w = new String[n];
        for(int i=0;i<n-1;i++){
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            w[i] = sc.next();
        }
        sc.close();
    }
 

    // global
    static int[] ans;
    static int[][] we;  // 2 if edge(i,j) is even, 1 if odd, 0 if no edge betw i,j;

    /**
     * solver
     */
    static void solve(){

        ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = -1;
        }

        // n = 1
        if (n <= 1) {
            System.out.println("0");
            return ;
        }

        // n > 1
        we = new int[n+1][n+1];  // 2 if edge(i,j) is even, 1 if odd, 0 if no edge betw i,j;
        for (int i=0;i<n-1;i++) {

            if ( Integer.parseInt(w[i].substring(w[i].length()-1)) % 2 == 0 ) {
                we[u[i]][v[i]] = 2;
                we[v[i]][u[i]] = 2;
            } else {
                we[u[i]][v[i]] = 1;
                we[v[i]][u[i]] = 1;
            }
        }

        bfs(1,0);

        for(int i=1;i<=n;i++){
            System.out.println(ans[i]);
        }
    }

    // paint u with "c=0,1"
    // paint neightbors of u with appropriate color
    private static void bfs(int u, int c) {

        if (ans[u] != -1) {
            return;
        }

        ans[u] = c;
        for (int v=1;v<=n;v++) {
            if (we[u][v] == 0) {
                continue;
            } else if (we[u][v] == 1) {
                bfs(v, 1-c);
            } else {
                bfs(v, c);
            }
        }
    };

    public static void main(String args[]) {

        input();

        solve();
    }
}
