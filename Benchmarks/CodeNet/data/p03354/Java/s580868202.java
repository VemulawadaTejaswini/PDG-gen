import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, M;
        N = scan.nextInt();
        M = scan.nextInt();
        Vector<Integer> p = new Vector<>();

        for(int i = 0; i < N; ++i) p.addElement(scan.nextInt());

        Union_Find tree = new Union_Find();

        tree.init(N + 1);

        for(int i = 0; i < M; ++i) tree.unite(scan.nextInt(), scan.nextInt());

        int ans = 0;

        for(int i = 0; i < N; ++i) if(tree.same(i + 1, p.get(i))) ++ans;

        System.out.println(ans);
    }
}

class Union_Find {
    private Vector<Integer> par = new Vector<>();
    private Vector<Integer> rank = new Vector<>();

    public void init(int n) {
        for(int i = 0; i < n; ++i) {
            par.addElement(i);
            rank.addElement(0);
        }
    }

    public int root(int x) {
        return par.get(x).equals(x) ? x : par.set(x, root(par.get(x)));
    }

    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    public void unite(int x, int y) {
        x = root(x);
        y = root(y);

        if(x == y) return;

        if(rank.get(x) < rank.get(y)) {
            par.set(x, y);
        } else {
            par.set(y, x);
            if(rank.get(x).equals(rank.get(y))) rank.set(x, rank.get(x) + 1);
        }
    }
}
