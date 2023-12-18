import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double as = Math.sqrt(a);
        double bs = Math.sqrt(b);
        double cs = Math.sqrt(c);
        if (as > cs || bs > cs) {
            System.out.println("No");
        } else {
            if (as + bs < cs) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}