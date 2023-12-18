import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 1;
        long b = 1;
        
        while (n-- > 0) {
            long newA = sc.nextLong();
            long newB = sc.nextLong();
            long x = (long)Math.max(Math.ceil((double)a / newA), Math.ceil((double)b / newB));
            a = newA * x;
            b = newB * x;
        }
        
        System.out.println(a+b);
    }
}