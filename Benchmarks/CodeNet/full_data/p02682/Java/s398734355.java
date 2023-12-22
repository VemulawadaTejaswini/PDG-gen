import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long k = sc.nextInt();
        
        long tmp = k;
        long now = 0;
        
        if (tmp > 0) {
        now = now + Math.min(a, tmp) * 1;
        tmp -= a;
        }
        if (tmp > 0) {
        now = now + Math.min(b, tmp) * 0;
        tmp -= b;
        }
        if (tmp > 0) {
        now = now + Math.min(a, tmp) * -1;
        tmp -= c;
        }
        
            System.out.println(now);
    }
}
