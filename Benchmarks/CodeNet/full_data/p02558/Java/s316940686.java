import java.util.*;

public class Main{
    int[] size;
    int[] parent;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        size = new int[n];
        parent = new int[n];
        for(int i = 0; i < n; i++){
            size[i] = 1;
            parent[i] = i;
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            int t = scan.nextInt();
            int u = scan.nextInt();
            int v = scan.nextInt();
            if(t == 0){
                unite(u, v);
            }else{
                System.out.println(same(u, v) == true ? 1 : 0);
            }
        }
    }

    int root(int x){
        if(x == parent[x]) return x;
        return parent[x] = root(parent[x]);
    }

    boolean same(int x, int y){
        return root(x) == root(y);
    }

    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if(x == y) return;
        if(size[x] < size[y]){
            parent[x] = y;
        }else{
            parent[y] = x;
            if(size[x] == size[y]) size[x]++;
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
