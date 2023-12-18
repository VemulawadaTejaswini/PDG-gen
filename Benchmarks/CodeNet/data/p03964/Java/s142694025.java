import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        while (n-- > 1) {
            int newA = sc.nextInt();
            int newB = sc.nextInt();
            long x = (long)Math.max(Math.ceil((double)a / newA), Math.ceil((double)b / newB));
            a = newA * x;
            b = newB * x;
        }
        
        System.out.println(a + b);
    }
}