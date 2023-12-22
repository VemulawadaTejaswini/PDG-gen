import java.util.Scanner;

/**
 * Created by malone on 2018/3/8.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int h = a / 3600, b = a % 3600, m = b / 60, s = b % 60;
        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}
