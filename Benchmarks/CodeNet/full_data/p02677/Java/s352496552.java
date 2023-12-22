import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        double hour = 30 * H + 0.5 * M;
        double minitue = 6 * M;

        double diff = Math.min(Math.abs(hour - minitue), 360 - Math.abs(hour - minitue));

        double temp = Math.pow(A, 2) + Math.pow(B, 2) - (2 * A * B * Math.cos(Math.toRadians(diff)));

        System.out.println(Math.pow(temp, 0.5));

    }
}