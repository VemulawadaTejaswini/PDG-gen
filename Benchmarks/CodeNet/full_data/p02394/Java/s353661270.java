import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();

        if (W - x - r >= 0 && W >= r + x && H - y - r >= 0 && H >= y + r) {
            System.out.println("Yes");
        } else {
            System.out
                    .println("No");
        }
    }
}