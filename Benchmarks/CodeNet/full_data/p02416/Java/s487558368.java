import java.util.Scanner;

/**
 * Sum of Numbers
 */
public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        Integer r = 0;
        int sum = 0;
        while (true) {
            r = scan.nextInt();
            if (r == 0) {
                return;
            }
            for (int i = 0; i < r.toString().length(); i++) {
                sum += Integer.parseInt(r.toString().substring(i, i + 1));
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}