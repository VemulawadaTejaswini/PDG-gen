import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        double sqrtA =  sqrt(a);

        double sqrtB =sqrt(b);
        double sqrtC = sqrt(c);


        if (sqrtA + sqrtB < sqrtC) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static double sqrt(long number) {
        double t;

        double squareRoot = number / 2;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);

        return squareRoot;
    }
}