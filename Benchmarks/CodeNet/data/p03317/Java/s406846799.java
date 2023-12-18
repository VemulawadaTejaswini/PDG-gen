
import java.util.Comparator;
import java.util.Scanner;

/* static int java.util.Arrays.binarySearch(int[] a, int key); */


public class Main {
    Scanner sc = new Scanner(System.in);
    int n, k;
    public void run(){
        n = sc.nextInt();
        k = sc.nextInt();
        solve();
    }
    public void solve(){
        int i = 0;
        int ans = 0;

        while(i < n){
            int flag = 0;
            ans++;
            for(int j = 0; j < k-1; j++){
                if(i < n) {
                    int a = sc.nextInt();
                    i++;

                    if (a == 1) {
                        flag = 1;
                    }
                }
                else{
                    break;
                }
            }
            if(flag == 1 && i < n){
                sc.nextInt();
                i++;
            }
        }
        System.out.println(ans);
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
            int x = ((Pair)arg0).first;
            int y = ((Pair)arg1).first;

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