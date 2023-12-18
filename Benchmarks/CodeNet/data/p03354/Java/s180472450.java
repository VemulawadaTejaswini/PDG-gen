import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class UnionTree{
    int[] tree;

    public UnionTree(int N){
        tree = new int[N];
        for(int i = 0; i < N; i++) tree[i] = i;
    }

    //return root
    public int root(int x){
        if(tree[x] == x) return x;
        else{
            tree[x] = root(tree[x]);
            return tree[x];
        }
    }

    //decision same group
    public boolean same(int x, int y){
        return (root(x) == root(y));
    }
    
    //unite group
    public void unite(int x, int y){
        if(same(x, y)) return;
        /* connect xroot to yroot */
        int rootx = root(x);
        int rooty = root(y);
        tree[rootx] = rooty;
        return;
    }
}
 
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[N];
        UnionTree tree = new UnionTree(N);

        
        for(int i = 0; i < N; i++){
            p[i] = sc.nextInt() - 1;
        }

        for(int i = 0; i < M; i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            tree.unite(x, y);
        }

        int c = 0;
        for(int i = 0; i < N; i++){
            if(tree.same(root(i), tree.root(p[i]))) c++;
        }

        System.out.println(c);
        
        return ;
    }
}