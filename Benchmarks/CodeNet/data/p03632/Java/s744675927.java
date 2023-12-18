import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if (B <= C) {
            System.out.print(0);
            return;
        }

        if (B <= D) {
            System.out.print(B - C);
        } else {
            System.out.print(D - C);
        }
    }
}