import java.util.*;
import java.lang.*;

class UnionFind{
    private int size;
    private int[] parent;
    private int[] blockSize;
    public UnionFind(int size){
        this.size = size;
        parent = new int[size];
        blockSize = new int[size];
        for(int i=0;i<size;i++){
            parent[i]=i;
            blockSize[i]=1;
        }
    }
    boolean isRoot(int node){
        return node==parent[node];
    }
    int getRoot(int node){
        if(isRoot(node)) return node;
        else{
            parent[node] = getRoot(parent[node]);
            return parent[node];
        }
    }
    public void union(int node1, int node2){
        if(find(node1, node2)) return;
        if(blockSize[node1]>blockSize[node2]){
            blockSize[getRoot(node1)] = blockSize[getRoot(node1)]+blockSize[getRoot(node2)];
            parent[getRoot(node2)] = getRoot(node1);
        } else{
            blockSize[getRoot(node2)] = blockSize[getRoot(node2)]+blockSize[getRoot(node1)];
            parent[getRoot(node1)] = getRoot(node2);
        }
    }
    public boolean find(int node1, int node2){
        return getRoot(node1)==getRoot(node2);
    }
    public int countGroup(){
        int ans = 0;
        for(int i=0;i<size;i++) if(isRoot(i)) ans++;
        return ans;
    }
    public int blockSize(int node){
        return blockSize[getRoot(node)];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M], b = new int[M];
        for(int m=0; m<M; m++){
            a[m] = sc.nextInt()-1;
            b[m] = sc.nextInt()-1;
        }

        int ans = 0;

        for(int m=0; m<M; m++){
            UnionFind graph = new UnionFind(N);
            for(int i=0; i<M; i++) if(i!=m) graph.union(a[i], b[i]);
            if(graph.blockSize(0)<N) ans++;
        }
        System.out.println(ans);
    }
}
