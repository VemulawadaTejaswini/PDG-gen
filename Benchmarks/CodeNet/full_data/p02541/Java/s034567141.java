import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long n = Long.parseLong(N);
        
        
        //まずは, 2Nの約数となるような数を洗い出す
        long[] aryX = new long[256];
        int index = 0;
        for (long i = 1; i <= n; i++) {
            if (2*n % i == 0) {
                aryX[index++] = i;
            }
        }
        
        long k = 1;
        while(true){
            
            long x = 0;
            for(long num : aryX) {
                if (num == 0) break;
                if (k % num == 0 && (k + 1) % (2 * n / num) == 0) {
                    x = num;
                    break;
                }
            }
            
            if (x == 0) {
                k++;
            } else {
             long y = 2 * n / x;
             
             long[] res = extgcd(x, y);
             k = x * (-res[1]); 
             
             while (k < 0) {
                 k += x * y;
             }
             
             while (k - x * y > 0) {
                 k -= x * y;
             }
             
             break;
            }     
            
        }
        System.out.println(k);

    }
    
    public static long[] extgcd(long a, long b) {
    long x0 = 1, x1 = 0;
    long y0 = 0, y1 = 1;

    while (b != 0) {
        long q = a / b;
        long r = a % b;
        long x2 = x0 - q * x1;
        long y2 = y0 - q * y1;

        a = b; b = r;
        x0 = x1; x1 = x2;
        y0 = y1; y1 = y2;
    }

    return new long[]{a, x0, y0};
    }
                        
}
        
         
   

