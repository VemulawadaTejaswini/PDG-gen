import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A < 2 || A > 20 || B < 1 || B > 20) {
            System.out.println(0);
            return;
        }

        int count = 1;
        while ((A * count - (count - 1)) < B) {
            count++;
        }
        System.out.println(count);
    }
}