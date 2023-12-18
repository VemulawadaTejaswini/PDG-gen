
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
/* static int java.util.Arrays.binarySearch(int[] a, int key); */
/* static int java.util.Arrays.binarySearch(int[] a, int key); */


public class Main {
    Scanner sc = new Scanner(System.in);
    int n;
    public void run(){

        n = sc.nextInt();
        solve();
    }
    public void solve(){
        ArrayList<Integer> pattern = new ArrayList<Integer>();
        pattern.add(1);

        for (int i = 6; i <= n; i = i * 6){
            pattern.add(i);
        }
        for(int i = 9; i <= n; i = i * 9){
            pattern.add(i);
        }
        pattern.sort(new MyComparator());

        int[] memo = new int[n+1];
        for(int i = 0; i < n+1; i++){
            memo[i] = -1;
        }

        ArrayList<Integer> wantcaches = new ArrayList<Integer>();
        wantcaches.add(n);
        ArrayList<Integer> getnums = new ArrayList<Integer>();
        getnums.add(0);

        while(wantcaches.size() != 0){
            int wantcache = wantcaches.get(0);
            wantcaches.remove(0);
            int getnum = getnums.get(0);
            getnums.remove(0);

            for(int i = 0; i < pattern.size(); i ++) {
                int getcache = pattern.get(i);
                if (getcache <= wantcache) {
                    int nextwantcache = wantcache - getcache;
                    int nextgetnum = getnum + 1;
                    if (memo[nextwantcache] == -1 || memo[nextwantcache] > nextgetnum) {
                        memo[nextwantcache] = nextgetnum;
                        wantcaches.add(nextwantcache);
                        getnums.add(nextgetnum);
                    }
                }
            }

        }
        System.out.println(memo[0]);
    }

    public static void main(String[] args){
        new Main().run();
    }

    static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }
    static class Edge{
        int to, cost;
        public Edge(int a, int b){
            this.to = a;
            this.cost = b;
        }
    }
    class MyComparator implements Comparator {
        @Override
        public int compare (Object arg0, Object arg1) {
            int x = (Integer )arg0;
            int y = (Integer) arg1;

            if (x < y) {
                return 1;
            } else if (x > y) {
                return -1;
            } else{
                return 0;
            }
        }
    }
    static class UnionFind{
        int par[];
        int rank[];

        //n要素で初期化
        public UnionFind(int maxn){
            par = new int[maxn];
            rank = new int[maxn];

            for(int i = 0; i < maxn; i++){
                par[i] = i;
                rank[i] = 0;
            }
        }

        //木の根を求める
        int find(int x){
            if(par[x] == x){
                return x;
            }
            else {
                return par[x] = find(par[x]);
            }
        }

        // xとyの属する集合を併合
        void unite (int x, int y){
            x = find(x);
            y = find(y);
            if(x == y){
                return;
            }

            if(rank[x] < rank[y]){
                par[x] = y;
            }
            else{
                par[y] = x;
                if(rank[x] == rank[y]) rank[x]++;
            }
        }

        // xとyが同じ集合に属するか否か
        boolean same(int x, int y){
            return find(x) == find(y);
        }
    }

}