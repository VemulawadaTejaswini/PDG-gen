import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long  b = sc.nextLong();
        long k = sc.nextLong();
        if(a >= k) {
            a -= k;
            k = 0;
        }else {
            k -= a;
            a = 0;
            b -= k;
        }
        
        System.out.println(a+" "+b);
    }
}