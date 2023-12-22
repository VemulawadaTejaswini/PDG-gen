import java.util.*;

public class Main{

    int n,m;
    ArrayList<int[]> list;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            //a, b, w
            list = new ArrayList<int[]>();
            for(int i=0; i<m; i++){
                int a = sc.nextInt(), b = sc.nextInt();
                int w = sc.nextInt();
                int[] tmp = {a-1,b-1,w};
                list.add(tmp);
            }

            Collections.sort(list, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[2] - b[2];
                    }
                });

            int ans = Integer.MAX_VALUE;
            for(int i=0; i<m && m-i>=n-1; i++){
                ans = Math.min(ans, kruskal(list.get(i)[2]));
            }

            if(ans==Integer.MAX_VALUE) ans = -1;
            System.out.println(ans);
        }
    }

    int kruskal(int min){
        int idx = 0;
        init();
        while(list.get(idx)[2]<min) idx++;

        int res = 0;
        for(int i=idx;i<m; i++){
            int[] ab = list.get(i);
            if(!same(ab[0],ab[1])){
                unite(ab[0],ab[1]);
                res = ab[2];
            }
        }

        boolean same = true;
        for(int i=1; i<n; i++){
            if(!same(0,i)) same = false;
        }

        if(same) return res-min;
        else return Integer.MAX_VALUE;
    }

    int[] par, rank;
    void init(){
        par = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
            rank[i] = 0;
        }
    }
    int find(int x){
        if(par[x]==x) return x;
        else return par[x] = find(par[x]);
    }
    void unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return;
        if(rank[x]<rank[y]) par[x] = y;
        else{
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
    }
    boolean same(int x, int y){
        return find(x)==find(y);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}