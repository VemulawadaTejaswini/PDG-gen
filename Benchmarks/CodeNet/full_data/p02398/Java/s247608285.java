import java.util.Scanner;

/**
 * Created by malone on 2018/3/9.
 */
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = 0;

        for (int i = a; i < b + 1; i++) {
            if (c % i == 0) {
                n++;
            }
        }
        System.out.println(n);
    }
}
