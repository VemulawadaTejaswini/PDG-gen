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
        long res = (int)1e9;
        
        int ins1 = binarySearch(rsw[f] + s/2)-1;
        if(f<ins1 && ins1<r){
            res = Math.min(res, Math.abs((rsw[ins1]-rsw[f])-(rsw[r]-rsw[ins1])));
        }
        
        int ins2 = binarySearch(rsw[f] + (s+1)/2);
        if(f<ins2 && ins2<r){
            res = Math.min(res, Math.abs((rsw[ins2]-rsw[f])-(rsw[r]-rsw[ins2])));
        }
        
        return res;
    }
    
    public static int binarySearch(long val){
        int result = Arrays.binarySearch(rsw, val);
        int ins = (result >= 0) ? result : ~result;
        return ins;
    }
}
