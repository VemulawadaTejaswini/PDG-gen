import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = (int) Math.floor(a * 0.08);
        int y = (int) Math.floor(b * 10);
        if (x != y) {
            System.out.println("-1");
        } else {
            System.out.println(x);
        }
    }
}
