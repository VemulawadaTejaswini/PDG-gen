import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(gcd(a, b));
        }
    }
    
    public static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b-a, a);
        } else if (b < a) {
            return gcd(a-b, b);
        } else {
            return a;
        }
    }
}