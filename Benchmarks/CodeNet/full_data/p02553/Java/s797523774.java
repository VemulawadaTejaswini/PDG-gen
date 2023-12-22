import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        
        long ans = -3000000000000000000L;
        ans = Math.max(ans, a*c);
        ans = Math.max(ans, a*d);
        ans = Math.max(ans, b*c);
        ans = Math.max(ans, b*d);
        System.out.println(ans);
    }
}
