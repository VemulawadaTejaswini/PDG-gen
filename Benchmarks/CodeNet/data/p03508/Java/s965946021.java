import java.util.Scanner;
import java.util.Arrays;
class UnionFind{
    int n;
    int[] data;

    UnionFind(int _n){
        n = _n;
        data = new int[n];
        Arrays.fill(data,-1);
    }

    int parent(int u){
        return (data[u] < 0 ? u:(data[u] = parent(data[u])));
    }

    boolean unite(int u, int v){
        u = parent(u);
        v = parent(v);
        if(u==v)return false;
        if(-data[u] < -data[v]){
            int w = u;
            u = v;
            v = w;
        }
        data[u] += data[v];
        data[v] = u;
        return true;
    }

    boolean isSame(int u, int v){
        return parent(u) == parent(v);
    }

    int tsize(int u){
        return -data[parent(u)];
    }
}

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        UnionFind uf = new UnionFind(N);
        for(int i = 0;i<M;++i){
            int a = scan.nextInt() -1;
            int b = scan.nextInt() -1;
            uf.unite(a, b);
        }

        int m1 = Math.min(uf.tsize(0),uf.tsize(1));
        int m2 = N - m1;

        long ans = (long)m1*(m1-1)/2 +(long)m2*(m2-1)/2;
        System.out.println(ans - M);

    }
}