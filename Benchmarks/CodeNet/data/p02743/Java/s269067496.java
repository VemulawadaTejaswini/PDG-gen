import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        
        double a2 = Math.sqrt(a);
        double b2 = Math.sqrt(b);
        double c2 = Math.sqrt(c);
        double d2 = c2 - (a2 + b2);
        
        double x3 = a2 * b2 * 2;
        
        if (a + b + x3 < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
