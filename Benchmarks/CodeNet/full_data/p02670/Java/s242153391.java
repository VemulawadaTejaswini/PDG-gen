import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        BinaryIndexedTree[] bith = new BinaryIndexedTree[n];
        BinaryIndexedTree[] bitv = new BinaryIndexedTree[n];
        //int[] p = new int[n*n];
        for(int i=0; i<n; i++){
            bith[i] = new BinaryIndexedTree(n);
            bitv[i] = new BinaryIndexedTree(n);
            for(int j=1; j<=n; j++){
                bith[i].add(j, 1);
                bitv[i].add(j, 1);
            }
        }
        
        long cnt = 0;
        for(int i=0; i<n*n; i++){
            int p = Integer.parseInt(sc.next())-1;
            int x = p%n;
            int y = p/n;
            
            bith[x].add(y+1, -1);
            bitv[y].add(x+1, -1);
            
            long h_all = bith[y].sum(n);
            long h_y = bith[y].sum(y);
            long h_min = Math.min(h_y, h_all - h_y);
            //System.out.println("h_all : " + h_all + ", h_y : " + h_y);
            //System.out.println("h_min : " + h_min);
            
            long v_all = bitv[x].sum(n);
            long v_x = bitv[x].sum(x);
            long v_min = Math.min(v_x, v_all - v_x);
            //System.out.println("v_all : " + v_all + ", v_x : " + v_x);
            //System.out.println("v_min : " + v_min);
            
            long min = Math.min(h_min, v_min);
            //System.out.println("@min : " + min);
            
            cnt += min;
        }
        
        System.out.println(cnt);
        
    }
}

class BinaryIndexedTree{
    int size;
    long[] tree;
    
    public BinaryIndexedTree(int n){
        this.size = n;
        this.tree = new long[n+1];
    }
    
    public long sum(int i){
        long s = 0L;
        while(0<i){
            s += tree[i];
            i -= i & -i;
        }
        return s;
    }
    
    public void add(int i, int x){
        while(i<=size){
            tree[i] += x;
            i += i & -i;
        }
    }
}