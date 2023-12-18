import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    ArrayList<Integer>[] tree;
    long maxN = 1000007;
    int[] edgeColor;
    int maxColor = 1;
    HashMap<Long, Integer> edgeRec = new HashMap<>();
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        edgeColor = new int[n+1];
        tree = new ArrayList[n+1];
        for(int i=0;i<=n;i++) tree[i] = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            // already know that a<b
            tree[a].add(b); tree[b].add(a);
            edgeRec.put(a*maxN+b, i);
        }
        dfs(1,-1,-1);
        PrintWriter out = new PrintWriter(System.out);
        out.println(maxColor);
        for(int i=0;i<n-1;i++){
            out.println(edgeColor[i]);
        }
        out.flush();
        out.close();
        return 0;
    }
    void dfs(int cur, int from, int fromColor){
        int color = 1;
        for(int to:tree[cur]){
            if(to==from) continue;
            if(color==fromColor) color += 1;
            maxColor = Math.max(maxColor, color);
            long key = Math.min(cur,to)*maxN+Math.max(cur,to);
            int edgeNum = edgeRec.get(key);
            edgeColor[edgeNum] = color;
            dfs(to, cur, color);
            color += 1;
        }
    }
}

