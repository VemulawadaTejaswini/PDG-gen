import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();

        int max = Math.max(Math.max(P, Q), R);

        System.out.println(P + Q + R - max);


    }
}