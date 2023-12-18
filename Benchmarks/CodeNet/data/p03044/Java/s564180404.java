import java.util.*;
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

    private static class Neighbor {

        public int v;
        public int we;

        Neighbor(int v, int we) {
            this.v = v;
            this.we = we;
        }
    }

    static ArrayList<ArrayList<Neighbor>> nb;

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
        nb = new ArrayList<ArrayList<Neighbor>>();
        for(int i=0;i<=n;i++) {
            nb.add(new ArrayList<Neighbor>());
        }

        for(int i=0;i<n-1;i++) {
            int c;
            if ( Integer.parseInt(w[i].substring(w[i].length()-1)) % 2 == 0 ) {
                c = 2;
            } else {
                c = 1;
            }
            nb.get(u[i]).add(new Neighbor(v[i], c));
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

        Iterator<Neighbor> it = nb.get(u).iterator();
        while (it.hasNext()){
            Neighbor b = it.next();

            if (b.we == 1) {
                bfs(b.v, 1-c);
            } else {
                bfs(b.v, c);
            }
        }
    };

    public static void main(String args[]) {

        input();

        solve();
    }
}
