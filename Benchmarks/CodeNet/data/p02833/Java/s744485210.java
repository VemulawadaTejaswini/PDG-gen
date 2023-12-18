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
        
        n /= 2;
        
        long count = 0;
        while (n != 0) {
            count += n / 5;
            n /= 5;
        }
        
        System.out.println(count);
    }
}
