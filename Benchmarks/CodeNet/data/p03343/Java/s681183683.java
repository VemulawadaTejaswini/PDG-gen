import java.util.*;

public class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int inf = (int)1e9;
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Val_idx[] b = new Val_idx[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = new Val_idx(a[i], i);
        }
        Arrays.sort(b);
        
        int l = b[0].idx;
        int r = b[0].idx;
        int i = 1;
        //どれでも
        if(k==1){
            i = n-q+1;
        }
        for(; i<=n-k-q+1; i++){
            //避けれるならパス
            int idx = b[i].idx;
            if(l-1<=idx){
                l = idx;
                continue;
            }
            if(r+1>=idx){
                r = idx;
                continue;
            }
            //
            break;
        }
        
        //System.out.println(i);
        
        long ans = inf;
        for(int j=0; j<i; j++){
            long tmp = b[j+q-1].val - b[j].val;
            ans = Math.min(ans, tmp);
        }
        
        System.out.println(ans);
    }
}

class Val_idx implements Comparable<Val_idx>{
    
    public int val;
    public int idx;
    
    public Val_idx(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
    
    @Override
    public int compareTo(Val_idx o) {
        return this.val - o.val;
    }
}