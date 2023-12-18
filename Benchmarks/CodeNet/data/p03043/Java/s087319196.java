import java.math.*;
import java.util.*;

public class Main {
    static BigDecimal per(int n,int i,int k) {
        int cnt = 0;
        
        while (true) {
            if (i > k)
                break;
            i *= 2;
            cnt++;
        }
        BigDecimal tmp = BigDecimal.valueOf(1 / (n * Math.pow(2, cnt)));
       
    return tmp;
} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigDecimal ans =BigDecimal.valueOf(0);
        for (int i = 1; i <= n; i++) {
            
            BigDecimal tmp = per(n, i, k);
            ans =ans.add(tmp);
            
        }
        System.out.println(ans);
    }
}
