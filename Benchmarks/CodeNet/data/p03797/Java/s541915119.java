import java.util.Scanner;

/**
 * Created by User on 2017/02/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;

        while (n > 0) {
            n--;
            m -= 2;
            count++;
        }
        while (m >= 4) {
            m-=4;
            count++;
        }

        System.out.println(count);
    }
}
