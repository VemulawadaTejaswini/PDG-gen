import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        int price = 100;

        for (int i = 0; ; i++) {
            price *= 1.01;
            if (X < price) {
                System.out.println(i);
                break;
            }
        }

    }
}
