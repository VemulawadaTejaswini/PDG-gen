import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

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

        UnionFind communicate = new UnionFind(N+M);
        //node 0,1, ... , N : person n
        //node N, N+1, ..., N+M-1 : language m

        for(int n=0; n<N; n++){
            int K = sc.nextInt();
            for(int k=0; k<K; k++){
                int l = sc.nextInt()-1;
                communicate.union(n, N+l);
            }
        }

        for(int n=1; n<N; n++){
            if(!communicate.find(0,n)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;

    }
}
