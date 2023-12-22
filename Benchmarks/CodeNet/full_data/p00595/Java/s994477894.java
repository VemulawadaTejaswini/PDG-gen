import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        try {
            while (sc.hasNext()) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                
                System.out.println(gcd(a,b));
            }
        } catch (NoSuchElementException e) {
            
        }
    }
    
    public static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b-a, a);
        } else if (b < a) {
            return gcd(a-b, b);
        }
        return a;
    }
}