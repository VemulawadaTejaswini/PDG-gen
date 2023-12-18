import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a + b == 15) {
                System.out.println("+");
                return;
            }
            if (a * b == 15) {
                System.out.println("*");
                return;
            }
            System.out.println("x");
        }
    }
}
