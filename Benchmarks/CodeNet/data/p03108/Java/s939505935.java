import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ans = new int[m];
        int inc = n*(n-1)/2;
        ans[m-1] = inc;
        Bridge[] bridges = new Bridge[m];
        for(int i=0;i<m;i++){
            bridges[i] = new Bridge(sc.nextInt()-1,sc.nextInt()-1);
        }
        UnionFind uf = new UnionFind(n);
        for(int i=m-1;i>0;){
            Bridge br = bridges[i];
            inc -= uf.inc(br);
            uf.unite(br);
            ans[--i] = inc;
        }
        for(int i=0;i<m;i++){
            System.out.println(ans[i]);
        }
    }
}

class Bridge{
    private int a;
    private int b;
    Bridge(int a, int b){
        this.a = a;
        this.b = b;
    }
    int getA(){return a;}
    int getB(){return b;}
}

class UnionFind{
    private int[] pares;
    private int[] ranks;
    private int[] sizes;
    UnionFind(int n){
        this.pares = new int[n];
        this.ranks = new int[n];
        this.sizes = new int[n];
        for(int i=0;i<n;i++){
            this.pares[i] = i;
            this.ranks[i] = 0;
            this.sizes[i] = 1;
        }
    }

    void unite(Bridge bridge){
        int a = bridge.getA();
        int b = bridge.getB();
        int ar = root(pares[a]);
        int br = root(pares[b]);
        if(ranks[ar]>ranks[br]){
            pares[br] = ar;
            sizes[ar] += sizes[br];
        }else if(ranks[br]>ranks[ar]){
            pares[ar] = br;
            sizes[br] += sizes[ar];
        }else if(ar != br){
            pares[br] = ar;
            sizes[ar] += sizes[br];
            ranks[ar] ++;
        }
    }

    int inc(Bridge bridge){
        int a = bridge.getA();
        int b = bridge.getB();
        int ar = root(a);
        int br = root(b);
        if(ar!=br){
            return sizes[ar]*sizes[br];
        }else{
            return 0;
        }
    }

    private int root(int a){
        if(pares[a]==a){
            return a;
        }else{
            pares[a]=root(pares[a]);
            return pares[a];
        }
    }
}