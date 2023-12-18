import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] aeve = new int[(n+1)/2];
        int[] aodd = new int[n/2];
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                aeve[i/2] = Integer.parseInt(sc.next());
            }else{
                aodd[i/2] = Integer.parseInt(sc.next());
            }
        }
        
        Arrays.sort(aeve);
        Arrays.sort(aodd);
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                a[i] = aeve[i/2];
            }else{
                a[i] = aodd[i/2];
            }
        }
        
        Inversion in = new Inversion();
        
        long ans = in.inv(in.zaatu(a));
        System.out.println(ans);
        
    }
}

class Inversion{
    public long inv(int[] a){
        long cnt = 0;
        int size = a.length;
        BinaryIndexedTree bit = new BinaryIndexedTree(size);
        
        for(int i=0; i<size; i++){
            int p = a[i];
            bit.add(p, 1);
            cnt += i + 1 - bit.sum(p);
        }
        return cnt;
    }
    
    public int[] zaatu(int[] a){
        ArrayList<Integer> b = new ArrayList<>();
        for(int tmp : a){
            b.add(tmp);
        }
        
        b = new ArrayList<Integer>(new HashSet<>(b));
        Collections.sort(b);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<b.size(); i++){
            map.put(b.get(i), i);
        }
        
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = map.get(a[i])+1;
        }
        
        return c;
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
