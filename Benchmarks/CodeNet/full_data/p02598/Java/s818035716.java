import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        int bmax = 0;
        for(int i=0; i<n; i++){
            int t = Integer.parseInt(sc.next());
            a[i] = t;
            int c = 0;
            while(t>0){
                c++;
                t /= 2;
            }
            b[i] = c;
            bmax = Math.max(bmax, c);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(a);
        reverse(b);
        
        for(int i=0; i<n; i++){
            //System.out.println(a[i]);
            //System.out.println(b[i]);
        }
        
        //にぶたん
        int ub = 33;
        int lb = 0;
        for(int i=0; i<20; i++){
            int mid = (ub+lb)/2;
            long cnt = 0;
            for(int j=0; j<n; j++){
                if(b[j] > mid){
                     cnt += b[j]-mid;
                }
            }
            if(cnt >= k){
                lb = mid;
            }else{
                ub = mid;
            }
        }
        
        //System.out.println(lb);
        
        int ans = 0;
        for(int i=0; i<n; i++){
            int tmp = a[i];
            int m = Math.max(0, b[i]-lb);
            m = Math.min(m, k);
            k -= m;
            
            m++;
            tmp = (tmp+m-1)/m;
            //System.out.println(tmp);
            //System.out.println(k);
            
            ans = Math.max(ans, tmp);
        }
        
        System.out.println(ans);
    }
    
    public static void reverse(int[] x){
        for(int i=0; i<x.length/2; i++){
            int tmp = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = tmp;
        }
    }
}
