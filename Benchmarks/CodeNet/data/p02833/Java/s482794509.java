import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        if (n % 2 != 0) {
            System.out.println(0);
            return;
        }
        
        long count = 0;
        long now = 2;
        while (true) {
            now *= 5;
            if (now > 1000000000000000000L) break;
            
            count += n / now;
        }
        
        System.out.println(count);
    }
}