import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        scanner.close();

        int price = N * 800;
        int refund = N / 15 * 200;

        System.out.println(price - refund);
    }
}
