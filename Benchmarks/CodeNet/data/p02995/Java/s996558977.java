import java.util.Scanner;
import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        
        long BC = B / C;
        long AC = (A - 1) / C;
        long BD = B / D;
        long AD = (A - 1) / D;
        
        // GCD
        long x = C > D ? C : D;
        long y = C > D ? D : C;
        long a = 1;
        while(a != 0){
            a = x % y;
            x = y;
            y = a;
        }
        
        long N = C * (D / x);
        long BN = B / N;
        long AN = (A - 1) / N;
        
        System.out.println((B - (A - 1)) - (BC + BD - (AD + AC) - (BN - AN)));
    }
}
