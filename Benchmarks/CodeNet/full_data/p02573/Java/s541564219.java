import java.util.*;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A=new int[M];
        int[] B=new int[M];
        Unionfind uf = new Unionfind(N+1);
        for(int i=0; i<M; i++){
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
            uf.union(A[i],B[i]);
        }
        
        int res=0;

        for(int i=0; i<N; i++){
            res = Math.max(res,uf.getSize(i));
        }
        System.out.println(res);
}


static class Unionfind {
		 
    private int[] data;
    private int []size;
    
    public Unionfind(int size) {
        this.data = new int [size];
        this.size = new int [size];
        for(int i = 0 ;i < size ;i++) {
            initnode(i);
        }
        clear();
    }
    
    public void initnode(int i) {
        size[i] = 1;
    }
    
    public void clear() {
        Arrays.fill(data, -1);
    }
    
    public void union(int x , int y ) {
        if((x = root(x)) != (y = root(y))) {
            if(data[y] < data[x]) {
                final int t = x;
                x = y;
                y = t;
            }
            data[x] += data[y];
            size[root(x)] += size[root(y)];
            data[y] = x;
        }
    }
    
    public int getSize(int i) {
        return size[root(i)];
    }
    
    public int root(int x) {
        if(data[x] < 0) {
            return x;
        }
        else {
            return data[x] = root(data[x]);
        }
    }
    
    public boolean same(int x, int y) {
        return root(x) == root(y);
    }
    
}
}