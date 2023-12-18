import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double l = 2 * Math.sqrt(a * b) + a + b;
        double r = c;
        if (l < r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
