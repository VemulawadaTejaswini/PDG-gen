import java.util.*;
import java.io.*;

class UnionFind{
    int size;
    int[] parent;
    int[] height;

    int[] partSize;

    public UnionFind(int size){
        this.size = size;
        parent = new int[size];
        height = new int[size];
        partSize = new int[size];
        for(int i=0;i<size;i++){
            parent[i]=i;
            height[i]=0;
            partSize[i]=1;
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
        if(find(node1,node2)) return;
        if(height[node1]>height[node2]){
            partSize[getRoot(node1)] = partSize[getRoot(node1)]+partSize[getRoot(node2)];
            parent[getRoot(node2)] = getRoot(node1);
        }else{
            partSize[getRoot(node2)] = partSize[getRoot(node1)]+partSize[getRoot(node2)];
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
    public int getPartSize(int node){
        return partSize[getRoot(node)];
    }
}
public class Main {
    static long countPair(long N){
        return N * (N-1) / 2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[M];
        int[] B = new int[M];
        for(int m=0; m<M; m++){
            A[m]=sc.nextInt()-1;
            B[m]=sc.nextInt()-1;
        }

        UnionFind bridge = new UnionFind(N);
        LinkedList<Long> convenient = new LinkedList<>();
        convenient.add(0L);

        for(int m=M-1; m>0; m--){
            if(bridge.find(A[m],B[m])) convenient.addFirst(convenient.getFirst());
            else{
                long x = convenient.getFirst() - countPair(bridge.getPartSize(A[m])) - countPair(bridge.getPartSize(B[m]));
                bridge.union(A[m], B[m]);
                x += countPair(bridge.getPartSize(A[m]));
                convenient.addFirst(x);
            }
        }
        //for(long a : convenient) System.out.println(a);
        for(long a : convenient) System.out.println(countPair(N) - a);
    }
}