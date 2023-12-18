import java.util.*;
import java.lang.*;
class UnionFind{
    int size;
    int[] parent;
    int[] height;
    public UnionFind(int size){
        this.size = size;
        parent = new int[size];
        height = new int[size];
        for(int i=0;i<size;i++){
            parent[i]=i;
            height[i]=0;
        }
    }
    private boolean isRoot(int node){
        return node==parent[node];
    }
    private int getRoot(int node){
        if(isRoot(node)) return node;
        else{
            parent[node] = getRoot(parent[node]);
            return parent[node];
        }
    }
    public void union(int node1, int node2){
        if(height[node1]>height[node2])parent[getRoot(node2)] = getRoot(node1);
        else parent[getRoot(node1)] = getRoot(node2);
    }
    public boolean find(int node1, int node2){
        return getRoot(node1)==getRoot(node2);
    }
    public int countGroup(){
        int ans = 0;
        for(int i=0;i<size;i++) if(isRoot(i)) ans++;
        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        UnionFind G = new UnionFind(N);
        for(int m=0; m<M; m++){
            int X = sc.nextInt()-1;
            int Y = sc.nextInt()-1;
            int Z = sc.nextInt();
            G.union(X,Y);
        }
        System.out.println(G.countGroup());

    }
}
