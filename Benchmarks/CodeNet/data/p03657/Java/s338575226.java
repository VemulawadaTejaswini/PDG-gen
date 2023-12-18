import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();

        if (a >= 1 && a <= 100 && b >= 1 && b <= 100) {

            if ((a + b) % 3 == 0) {

                System.out.println("Possible");
            } else {

                System.out.println("Impossible");
            }
        }
    }
}
