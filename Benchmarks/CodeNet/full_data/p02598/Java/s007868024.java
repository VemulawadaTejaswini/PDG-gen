import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        var a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int left = 0;
        int right = 1000000000;
        while(right-left > 1){
            int mid = (left + right) / 2;
            if(b(n, a, mid) <= k){
                right = mid;
            }else{
                left = mid;
            }
        }
    
        System.out.println(right);
    }
    
    static long b(int n, int[] a, int mid){
        
        long l = 0;
        for(int i = 0; i < n; i++){
            l += a[i] / mid;
            if(a[i] % mid == 0) l -= 1;
        }
        return l;
    }
}