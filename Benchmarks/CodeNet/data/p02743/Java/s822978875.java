import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        if(c<=a+b) {
            System.out.println("No");
            return;
        }
        // c-a-b > 2 sqr(ab)
        // log(c-a-b) > log(2) + 1/2log a + 1/2log b
        double left = Math.log(c-a-b);
        double right = Math.log(2) + Math.log(a)/2.0 + Math.log(b)/2.0;
        System.out.println((left>right) ? "Yes" : "No");
    }
}
