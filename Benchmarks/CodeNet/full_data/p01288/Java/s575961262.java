import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            if ((n | q) == 0)
                break;
            UnionFind uf = new UnionFind(n);
            if (n != 1) {
                for (int i = 2; i <= n; i++) {
                    int p = sc.nextInt();
                    uf.par[i] = p;
                }
            }
            long ans = 0;
            for (int i = 0; i < q; i++) {
                String t = sc.next();
                int v = sc.nextInt();
                if (t.equals("M"))
                    uf.mark[v] = true;
                else
                    ans += uf.find(v);
            }
            System.out.println(ans);
        }
    }
}
 
class UnionFind {
    public int par[];
    public boolean mark[];
 
    UnionFind(int n) {
        par = new int[n + 1];
        mark = new boolean[n + 1];
        mark[0] = true;
        mark[1] = true;
        par[1] = 1;
    }
 
    public int find(int x) {
        while (true) {
            if (mark[x]) {
                return x;
            } else {
                x = par[x];
            }
        }
    }
}