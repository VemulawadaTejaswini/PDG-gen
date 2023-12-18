import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = 0;

        for (int i = 0; i <= 1000; i++) {
            int power = i * i;

            if (power >= result && power <= x) {
                result = power;
            } else {
                break;
            }
        }

        System.out.println(result);

    }
}