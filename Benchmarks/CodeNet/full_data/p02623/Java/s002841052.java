import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        var a = new int[n];
        var b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < m; i++){
            b[i] = Integer.parseInt(sc.next());
        }
        
        var a2 = new long[n+1];
        a2[1] = a[0];
        for(int i = 2; i <= n; i++){
            a2[i] = a2[i-1] + a[i-1];
        }
        
        var b2 = new Long[m];
        b2[0] = (long) b[0];
        for(int i = 1; i < m; i++){
            b2[i] = b2[i-1] + b[i];
        }
        
        int ans = 0;
        for(int i = 0; i <= n; i++){
            if(a2[i] > k) break;
            int j = upperBound(b2, k - a2[i]);
            ans = Math.max(i+j, ans);
        }
        System.out.println(ans);
    }
    
    static int upperBound(Long[] a, long key){
        return ~Arrays.binarySearch(a, key, (x, y) -> (x.compareTo(y) > 0) ? 1 : -1);
    }
}