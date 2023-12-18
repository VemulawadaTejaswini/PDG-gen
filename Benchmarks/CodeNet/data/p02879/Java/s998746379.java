
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int a = std.nextInt();
        int b = std.nextInt();
        if (a < 1 || b < 1) {
            System.out.println(-1);
            return;
        }
        if (a > 10 || b > 10) {
            System.out.println(-1);
        } else {
            System.out.println(a * b);
        }
    }
}
