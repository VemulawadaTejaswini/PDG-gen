import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = (long)Math.sqrt((double)n);
        long b = 0;
        long c = 0;
        
        for (long i = a; i > 0; i--) {
            if (n % i == 0) {
                b = n / i;
                c = i;
                break;
            }
        }
        System.out.println(b + c - 2);
    }
}
