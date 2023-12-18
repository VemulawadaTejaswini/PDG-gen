import java.util.*;

public class Main{
    static int n;
    static int[] a;
    static long[] rsw;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new int[n];
        rsw = new long[n+1];
        
        int sum = 0;
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
            rsw[i+1] = sum;
        }
        
        long ans = 1L<<30;
        
        //まんなか
        for(int i=2; i<n-1; i++){
            long s1 = rsw[i];
            long s2 = sum - rsw[i];
            
            long d1 = calcD(0, i, s1);
            long d2 = calcD(i, n, s2);
            
            long max = Math.max(s1+d1, s2+d2)/2;
            long min = Math.min(s1-d1, s2-d2)/2;
            
            ans = Math.min(ans, max-min);
        }
        
        System.out.println(ans);
    }
    
    public static long calcD(int f, int r, long s){
        long res = (int)1e18;
        
        int ins1 = bsl(rsw[f] + s/2);
        if(ins1>0){
            res = Math.min(res, calcRes(f, r, ins1));
        }
        
        int ins2 = bsu(rsw[f] + s/2);
        if(ins2<n){
            res = Math.min(res, calcRes(f, r, ins2));
        }
        
        return res;
    }
    
    public static long calcRes(int f, int r, int ins){
        return Math.abs((rsw[ins]-rsw[f])-(rsw[r]-rsw[ins]));
    }
    
    public static int bsl(long val){
        int ok = 0;
        int ng = n;
        for(int i=0; i<30; i++){
            int mid = (ok+ng)/2;
            if(rsw[mid]<=val){
                ok = mid;
            }else{
                ng = mid;
            }
        }
        return ok;
    }
    
    public static int bsu(long val){
        int ok = n;
        int ng = 0;
        for(int i=0; i<30; i++){
            int mid = (ok+ng)/2;
            if(rsw[mid]>val){
                ok = mid;
            }else{
                ng = mid;
            }
        }
        return ok;
    }
}
