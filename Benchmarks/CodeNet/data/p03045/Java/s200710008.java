import java.time.Year;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int n;
    static int m;
    static int x[];
    static int y[];
    static int z[];

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = new int[m];
        y = new int[m];
        z = new int[m];

        for(int i=0;i<m;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.nextInt();
        }
        sc.close();
    }
 

    // global
    static int[] ans;

    private static class UnionFindTree {

        private static int[] par;
        private static int[] rank;
        private static int size;

        UnionFindTree(int n){
            this.par = new int[n];
            this.rank = new int[n];

            for(int i=0;i<n;i++){
                this.par[i] = i;
            }
            this.size = n;
        }

        int find(int x) {
            if (this.par[x] == x) {
                return x;
            } else {
                return par[x] = this.find(par[x]);
            }
        }

        void unite(int x, int y) {
            x = this.find(x);
            y = this.find(y);
            if (x == y) return;

            if (this.rank[x] < this.rank[y]) {
                this.par[x] = y;
            } else {
                this.par[y] = x;
                if (this.rank[x] == this.rank[y]) this.rank[x] ++;
            }
            size --;
        }

        boolean same(int x, int y) {
            return false;
        }

        int size(){
            return this.size;
        }
    }


    /**
     * solver
     */
    static void solve(){

        UnionFindTree uft = new UnionFindTree(2*(n+1));

        for(int i=0;i<m;i++){
            if (z[i] % 2 == 1) {
                uft.unite(x[i], y[i]+n);
                uft.unite(x[i]+n, y[i]+n);
            } else {
                uft.unite(x[i], y[i]);
                uft.unite(x[i]+n,y[i]+n);
            }
        }

        System.out.println((uft.size()-2)/2);
    }


    public static void main(String args[]) {

        input();

        solve();
    }
}
