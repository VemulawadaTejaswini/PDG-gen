import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    long mod = 1000000000+7;
    int cnt2 = 0;
    ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    String solve() throws IOException {
        int n = sc.nextInt();
        tree = new ArrayList[n+1];
        for(int i=0;i<=n;i++) tree[i] = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            tree[a].add(b); tree[b].add(a);
        }
        int[] color = new int[n+1];
        dfs(1,1,1,color);
        String res = helper(n,color);
        if(!res.equals("-1")) return res;
        for(int i=1;i<=n;i++) color[i] = 3-color[i]; // 1->2 and 2->1
        res = helper(n,color);
        return  res;
    }
    String helper(int n, int[] color){
        int one = 1, two = 2, three = 3;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            int ans;
            if(color[i]==1&&one<=n){
                ans = one; one+=3;
            } else if(color[i]==2&&two<=n){
                ans = two; two += 3;
            } else{
                if(three<=n){
                    ans = three; three += 3;
                } else return "-1";
            }
            sb.append(ans).append(' ');
        }
        return sb.toString();
    }
    void dfs(int cur, int from, int cur_color, int[] color){
        color[cur] = cur_color;
        for(int to:tree[cur]){
            if(to==from) continue;
            dfs(to,cur,3-cur_color,color);
        }
    }
}