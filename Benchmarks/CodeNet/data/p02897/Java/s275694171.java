import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        scan.close();

        double even = 0;
        double odd = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        double ans = odd / (even + odd);
        System.out.println(ans);
    }
}