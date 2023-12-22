import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        long x = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
    
        BigInteger bx = BigInteger.valueOf(x);
        BigInteger bk = BigInteger.valueOf(k);
        BigInteger bd = BigInteger.valueOf(d);
        
        if(bx.compareTo(bd.multiply(bk)) >= 0){
            System.out.println(x - d*k);
        }else if(x == 0){
            if(k%2 == 0){
                System.out.println(0);
            }else{
                System.out.println(d);
            }
        }else{
            if(x < 0) x = -x;
            long a = k - x/d;
            if(a%2 == 0){
                System.out.println(x%d);
            }else{
                System.out.println(d - x%d);
            }
        }
    }
}