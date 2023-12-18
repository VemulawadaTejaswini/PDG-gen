import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int s = scanner.nextInt();

        for (int i = 1; i <= 100; i *= 10) {
            if (s / i % 10 == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}