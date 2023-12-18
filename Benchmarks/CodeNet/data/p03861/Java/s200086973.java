import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % x == 0) {
                sum++;
            }
        }
        System.out.print(sum);
    }
}
