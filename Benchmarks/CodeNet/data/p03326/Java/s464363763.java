import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/* static int java.util.Arrays.binarySearch(int[] a, int key); */


public class Main {
    Scanner sc = new Scanner(System.in);
    int n,m;
    public void run(){
        n = sc.nextInt();
        m = sc.nextInt();
        solve();
    }
    public void solve(){
        long sumppp[] = new long[n];
        long sumppm[] = new long[n];
        long sumpmp[] = new long[n];
        long summpp[] = new long[n];
        long summmp[] = new long[n];
        long summpm[] = new long[n];
        long sumpmm[] = new long[n];
        long summmm[] = new long[n];
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            sumppp[i] = x + y + z;
            sumppm[i] = x + y - z;
            sumpmp[i] = x - y + z;
            summpp[i] = -x + y + z;
            summmp[i] = -x - y + z;
            summpm[i] = -x + y - z;
            sumpmm[i] = x - y - z;
            summmm[i] = -x - y - z;
        }

        Arrays.sort(sumppp);
        Arrays.sort(sumppm);
        Arrays.sort(sumpmp);
        Arrays.sort(summpp);
        Arrays.sort(summmp);
        Arrays.sort(summpm);
        Arrays.sort(sumpmm);
        Arrays.sort(summmm);

        long sum1 = 0;
        long sum2 = 0;
        long sum3 = 0;
        long sum4 = 0;
        long sum5 = 0;
        long sum6 = 0;
        long sum7 = 0;
        long sum8 = 0;
        for(int i = 0; i < m; i++){
            sum1 += sumppp[n - 1 - i];
            sum2 += sumppm[n - 1 - i];
            sum3 += sumpmp[n - 1 - i];
            sum4 += summpp[n - 1 - i];
            sum5 += summmp[n - 1 - i];
            sum6 += summpm[n - 1 - i];
            sum7 += sumpmm[n - 1 - i];
            sum8 += summmm[n - 1 - i];
        }

        long ans = Math.max (sum1, Math.max(sum2, Math.max(sum3, Math.max(sum4, Math.max(sum5, Math.max(sum6, Math.max(sum7, sum8)))))));
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