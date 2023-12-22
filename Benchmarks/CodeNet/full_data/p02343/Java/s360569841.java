import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        int n, q;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        q = scanner.nextInt();
        UnionFind uf = new UnionFind(n);

        for(int i = 0; i < q; i++){
            int query, x, y;
            query = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(query == 0){
                uf.unite(x, y);
            }
            if(query == 1){
                if(uf.same(x, y)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }
    }
}

class UnionFind {
    private int n;
    private int[] root;

    UnionFind(int n){
        this.n = n;
        this.root = new int[n];
        for(int i = 0; i < n; i++){
            root[i] = i;
        }
    }

    private int find(int x){
        if(x == root[x]) {
            return root[x];
        }
        return root[x] = find(root[x]);
    }

    public boolean same(int x, int y){
        return find(x) == find(y);
    }

    public void unite(int x, int y){
        if(same(x, y)) return;
        x = find(x);
        y = find(y);

        root[y] = x;
    }
}




