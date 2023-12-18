import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        long sum = 0;
        
        int a = 0;
        int b = 0;
        
        while (n-- > 0) {
            b = sc.nextInt();
            sum += Math.min(b - a, t);
            a = b;
        }
        
        sum += t;
        
        System.out.println(sum);
    }
}
