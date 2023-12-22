import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        long[] a = new long[n+2];
        long[] b = new long[m+1];
        for(int i=0; i<n; i++){
            a[i+1] = Long.parseLong(sc.next());
        }
        for(int i=0; i<a.length-1; i++){
            a[i+1] += a[i];
        }
        for(int i=0; i<m; i++){
            b[i] = Long.parseLong(sc.next());
            if(i>0){
                b[i] += b[i-1];
            }
        }
        
        int max = 0;
        for(int i=0; i<a.length; i++){
            int ub = m;
            int lb = 0;
            long l = k - a[i];
            //System.out.println(a[i]);
            if(l<0){
                break;
            }
            for(int j=0; j<100; j++){
                int mid = (ub+lb)/2;
                if(b[mid]<l){
                    lb = mid;
                }else{
                    ub = mid;
                }
            }
            int tmp = i+ub;
            max = Math.max(max, tmp);
        }
        
        System.out.println(max);
        
    }
    
}
