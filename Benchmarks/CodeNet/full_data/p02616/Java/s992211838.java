import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(a);
        long ans = 1;
        if(a[n-1]<=0){
            if(k%2==1){
                for(int i=0; i<k-1; i+=2){
                    long tmp = a[n-1-i]*a[n-2-i]%MOD;
                    ans = ans*tmp%MOD;
                }
                ans = ans*a[n-k]%MOD;
            }else{
                for(int i=0; i<k; i+=2){
                    long tmp = a[i]*a[i+1]%MOD;
                    ans = ans*tmp%MOD;
                }
            }
        }else{
            int l = 0;
            int r = n-1;
            if(k%2==1){
                ans = ans*a[r]%MOD;
                r--;
            }
            while(k>1){
                long m = a[l]*a[l+1];
                long p = a[r]*a[r-1];
                if(m >= p){
                    ans = ans*(m%MOD)%MOD;
                    l+=2;
                }else{
                    ans = ans*(p%MOD)%MOD;
                    r-=2;
                }
                k-=2;
            }
        }
        System.out.println((ans+MOD)%MOD);
    }
}
