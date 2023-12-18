import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        if (a == b && a % x == 0) {
            System.out.println(1);
            return;
        }
        
        long l = a / x;
        if (a % x != 0) {
            l++;
        }
        long m = b / x;
        if (b % x != 0) {
            m++;
        }
        
        System.out.println(m - l + 1);
    }
}
