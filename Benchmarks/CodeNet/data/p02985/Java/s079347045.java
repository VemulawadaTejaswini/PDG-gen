import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    ArrayList<Integer>[] tree;
    long ans = 1;
    int n,k;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        tree = new ArrayList[n];
        for(int i=0;i<n;i++) tree[i] = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            tree[a].add(b); tree[b].add(a);
        }
        ans *= k;
        int cnt = 0;
        for(int to:tree[0]){
            dfs(to,0,k-1-cnt);
            cnt++;
        }
        return ans;
    }
    // dfs starts from the child of a chosen root
    void dfs(int cur_vertex, int from, int val){
        ans = ans*Math.max(0,val)%mod;
        int cnt = 0;
        for(int to:tree[cur_vertex]){
            if(to==from) continue;
            dfs(to,cur_vertex,k-(cnt+2));
            cnt++;
        }
    }
}