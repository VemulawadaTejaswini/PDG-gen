import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (scanner.hasNext()) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            
            long gcd = 0;
            long lcm = 0;
            
            if (y < x) {
                long temp = y;
                y = x;
                x = temp;
            }
            
            for (long i = x; i > 1; i--) {
                if ((x%i == 0) && (y%i == 0)) {
                    gcd = i;
                    break;
                } else {
                    continue;
                }                
            }
            
            lcm = x * y /gcd;

            System.out.println(gcd + " " + lcm);
        }
    }
}