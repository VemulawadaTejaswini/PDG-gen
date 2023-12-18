import java.util.Comparator;
import java.util.Scanner;


public class Main {
    Scanner sc = new Scanner(System.in);
    int n;
    long[] x;
    long[] y;
    long summax = 0;
    public void run(){
        n = sc.nextInt();
        x = new long[n];
        y = new long[n];

        for(int i = 0; i < n; i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            if(Math.abs(x[i]) + Math.abs(y[i]) > summax) summax = Math.abs(x[i]) + Math.abs(y[i]);
        }
        solve();
    }
    public void solve(){
        if(summax <= 40){
            String[] ans = new String[n];
            for(int i = 0; i < n; i++) {
                for (long a = 0; a <= summax; a++) {
                    for (long b = 0; b <= summax - a; b++) {
                        for (long c = 0; c <= summax - b; c++) {
                            long d = summax - a - b - c;
                            long nx = x[i];
                            long ny = y[i];
                            if (nx == a - b && ny == c - d){
                                String s = "";
                                for(int j = 0; j < a; j++) s += "R";
                                for(int j = 0; j < b; j++) s += "L";
                                for(int j = 0; j < c; j++) s += "U";
                                for(int j = 0; j < d; j++) s += "D";
                                ans[i] = s;
                                break;
                            }
                        }
                        if(ans[i] != null) break;
                    }
                    if(ans[i] != null) break;
                }
                if(ans[i] == null) {
                    System.out.println("-1");
                    return;
                }
            }

            System.out.println(summax);
            for(int i = 0; i < summax; i++){
                System.out.print("1");
                if(i != summax - 1) System.out.print(" ");
            }
            System.out.println();
            for(int i = 0; i < n; i++){
                System.out.println(ans[i]);
            }
        }
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