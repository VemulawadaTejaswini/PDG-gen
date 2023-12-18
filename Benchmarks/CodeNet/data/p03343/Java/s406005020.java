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
        for(; i<=n-k-q+1; i++){
            //避けられるなら次
            if(simyu(i, b, n, k, q)) continue;
            //
            break;
        }
        
        //System.out.println(i);
        
        
        long ans = b[q-1].val - b[0].val;
        for(int j=0; j<i; j++){
            long tmp = b[j+q-1].val - b[j].val;
            ans = Math.min(ans, tmp);
        }
        
        System.out.println(ans);
    }
    
    public static boolean simyu(int ti, Val_idx[] b, int n, int k, int q){
        int[] c = new int[ti+2];
        for(int i=0; i<ti; i++){
            c[i+1] = b[i].idx;
        }
        c[0] = -1;
        c[ti+1] = n;
        Arrays.sort(c);
        
        int sum = 0;
        for(int i=0; i<c.length-1; i++){
            int tmp = c[i+1] - c[i] - k;
            sum += Math.max(0, tmp);
        }
        
        if(sum >= q){
            return true;
        }else{
            return false;
        }
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