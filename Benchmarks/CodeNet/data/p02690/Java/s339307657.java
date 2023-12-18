import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();

        int i = 0;
        while (true) {
            double temp = Math.pow(i, 5) + X;
            double a = Math.pow(temp, 0.2);

            if ((a == Math.floor(a)) && !Double.isInfinite(a)) {
                int A = (int) a;

                System.out.println(A + " " + i);
                return;

            }

            i--;

        }

    }
}