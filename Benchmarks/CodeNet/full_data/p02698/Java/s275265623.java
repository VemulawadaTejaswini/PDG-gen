import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] res;
    ArrayList<Integer>[] tree;
    int[] ans;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        out.println(main.solve());
        out.flush();
    }
    void solve(){
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=1; i<=n; i++){
            a[i] = sc.nextInt();
        }
        tree = new ArrayList[n+1];
        for(int i=0;i<=n;i++) tree[i] = new ArrayList<>();
        for(int i=1;i<=n-1;i++){
            int u = sc.nextInt(), v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }
        res = new int[n+1];
        ArrayList<Integer> list = new ArrayList<>();
        dfs(1,-1,list,a);
        for(int i=1; i<=n;i++){
            out.println(res[i]);
        }
    }
    void dfs(int cur, int from, ArrayList<Integer> arr, int[] a){
        // suppose that arr is at least size = 1
        // keep arr strictly increasing
        if(arr.size()==0||a[cur]> arr.get(arr.size()-1)){
            arr.add(a[cur]);
            res[cur] = arr.size();
            for(int to:tree[cur]){
                if(to==from) continue;
                dfs(to,cur,arr,a);
            }
            arr.remove(arr.size()-1);
        } else {
            int idx = binary(arr, a[cur]);
            int backup = arr.get(idx);
            arr.set(idx, a[cur]);
            res[cur] = arr.size();
            for (int to : tree[cur]) {
                if (to == from) continue;
                dfs(to, cur, arr, a);
            }
            arr.set(idx, backup);
        }
    }
    int binary(ArrayList<Integer> list, int val){
        // already know that val <= list[size-1]
        // return the least idx s.t. list[idx]>=val
        int n = list.size();
        if(list.get(0)>=val) return 0;
        int lo = 0, hi = n-1;
        while(hi>lo+1){
            int mid = (hi+lo)/2;
            if(list.get(mid)==val) return mid;
            if(list.get(mid)>val) hi = mid;
            else lo = mid;
        }
        return hi;
    }
}

