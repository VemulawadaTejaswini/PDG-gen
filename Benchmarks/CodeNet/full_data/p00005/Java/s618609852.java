import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int a = input.nextInt();
            int b = input.nextInt();
            int gcd = GCD(a, b);
            int lcm = a / gcd * b;

            System.out.println(gcd + " " + lcm);
        }
    }
    
    public static int GCD (int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}