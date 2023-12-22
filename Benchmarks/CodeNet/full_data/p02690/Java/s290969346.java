import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < (X + 1) / 2; i++) {
            double temp = Math.abs(Math.pow(i, 5) - X);
            double b = Math.pow(temp, 0.2);

            if ((b == Math.floor(b)) && !Double.isInfinite(b)) {
                int B = (int) b;
                System.out.println(i + " " + B);
                return;
            }

        }

    }
}
