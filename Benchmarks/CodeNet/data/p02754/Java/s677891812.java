import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (a <= b + c) {
            System.out.println(b);
        } else {
            long d = a / (b + c);
            long e = a % (b + c);
            
            e = Math.min(e, b);
            
            System.out.println(d * b + e);
        }
    }
}
