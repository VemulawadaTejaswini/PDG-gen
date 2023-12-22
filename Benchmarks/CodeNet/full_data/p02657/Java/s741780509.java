import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
 
        double product = 1;
        double limit = Math.pow(10, 18);
 
        for (long i = 1; i <= N; i++) {
            long A_i = scan.nextLong();
            product = product * A_i;
        }
 
        if (product > limit) {
            System.out.println("-1");
            return;
        } 
        
        System.out.println(product);
        
    }
 
}