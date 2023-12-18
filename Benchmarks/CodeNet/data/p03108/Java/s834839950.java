import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] res = new long[m];

        int[] a = new int[m];
        int[] b = new int[m];
        for(int i=0; i<m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        long u = (long)n * (n-1) / 2;
        UnionFind uf = new UnionFind(n);

        res[m-1] = u;
        for (int i=m-1; i>0; i--) {
            int ra = uf.root(a[i]);
            int rb = uf.root(b[i]);

            if(ra != rb) {
                int numa = uf.num[ra];
                int numb = uf.num[rb];
                u -= numa * numb;
                int num = numa + numb;
                uf.num[ra] = uf.num[rb] = num;
                uf.connect(ra, rb);
            }
            res[i-1] = u;

        }

        for(int i=0; i<m; i++) {
            System.out.println(res[i]);
        }

    }
    static class UnionFind {
        int[] uf;
        int[] num;
        int n;
        public UnionFind(int n) {
            this.n = n;
            uf = new int[n];
            num = new int[n];
            for(int i=0; i<n; i++) {
                uf[i] = i;
                num[i] = 1;
            }
        }
        public int root(int a) {
            if(uf[a] == a) {
                return a;
            }
            uf[a] = root(uf[a]);
            return uf[a];
        }
        public boolean isGroup(int a, int b) {
            return root(a) == root(b);
        }
        public void connect(int a, int b) {
            uf[root(a)] = root(b);
        }
        public void print() {
            System.out.println(Arrays.toString(uf));
        }
        public void compact() {
            for(int i=0; i<n; i++) {
                root(i);
            }
        }
        public boolean isRoot(int a) {
            return a == uf[a];
        }
    }

}