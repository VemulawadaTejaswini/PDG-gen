import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        new Main().solve();
    }
    int n,m;
    int[]k;
    int[][]l;
    ArrayList<Integer>[]edge;
    boolean[] visited;

    void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = new int[n];
        l = new int[n][];

        for (int i = 0; i < n; i++) {
            k[i] = Integer.parseInt(sc.next());
            l[i] = new int[k[i]];
            for (int j = 0; j < k[i]; j++) {
                l[i][j] = Integer.parseInt(sc.next());
            }
        }
        edge=new ArrayList[n+m];
        for(int i=0;i<n+m;i++){
            edge[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < k[i]; j++) {
                edge[i].add((n-1)+l[i][j]);
                edge[(n-1)+l[i][j]].add(i);
            }
        }

        visited=new boolean[n+m];
        dfs(0);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    void dfs(int x) {
        visited[x] = true;
        for (int i = 0; i < edge[x].size(); i++) {
            if (!visited[edge[x].get(i)]) {
                dfs(edge[x].get(i));
            }
        }
    }
}