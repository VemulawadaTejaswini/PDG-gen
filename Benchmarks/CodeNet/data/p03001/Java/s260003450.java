import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.print(W * H / 2.0);

        if (W * y == H * x) {
            System.out.print(" 1");
        } else {
            System.out.print(" 0");
        }
    }
}
