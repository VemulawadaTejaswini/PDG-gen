import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i = 1; i < n; i++){
            int low = 0;
            int high = n;
    
            while(high - low > 1){
                int mid = (low + high) / 2;
                if(ok(mid, i, n)){
                    low = mid;
                }else{
                    high = mid;
                }
            }
            
            int x = Math.max(low - i, 0);
            ans += x * 2;
            if((long) i * (long) i < n) ans += 1;
        }
        System.out.println(ans);
    }
    
    static boolean ok(long mid, long i, long n){
        return mid * i < n;
    }
}