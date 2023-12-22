import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(getDigit(a + b));
        }
    }

    static int getDigit(int value) {
        if (value == 0) { return 1; }

        int digit = 0;

        while (value > 0) {
            value /= 10;
            digit++;
        }

        return digit;
    }

}