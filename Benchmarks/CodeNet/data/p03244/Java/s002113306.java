
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    Scanner sc = new Scanner(System.in);
    int n;
    public void run(){
        n = sc.nextInt();
        solve();
    }
    public void solve(){
        int[] a1 = new int[10001];
        int[] a2 = new int[10001];

        int maxa1 = 0;
        int maxnuma1 = -1;
        int seca1 = 0;
        int suma1 = 0;
        int maxa2 = 0;
        int maxnuma2 = -1;
        int seca2 = 0;
        int suma2 = 0;

        for(int i = 0; i < n; i++){
            int v = sc.nextInt()-1;
            if(i % 2 == 0){
                a1[v]++;
                if(maxa1 < a1[v]) {
                    if(maxnuma1 != v) {
                        seca1 = maxa1;
                    }
                    maxa1 = a1[v];
                    maxnuma1 = v;
                }
                else if(seca1 < a1[v]){
                    seca1 = a1[v];
                }
                suma1++;
            }
            else{
                a2[v]++;
                if(maxa2 < a2[v]) {
                    if(maxnuma2 != v) {
                        seca2 = maxa2;
                    }
                    maxa2 = a2[v];
                    maxnuma2 = v;
                }
                else if(seca2 < a2[v]){
                    seca2 = a2[v];
                }
                suma2++;
            }
        }

        int ans = -1;

        if(maxnuma1 != maxnuma2){
            ans = suma1 - maxa1 + suma2 - maxa2;
        }
        else{
            ans = Math.min(suma1-maxa1 + suma2 -seca2, suma1-seca1 + suma2-maxa2);
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