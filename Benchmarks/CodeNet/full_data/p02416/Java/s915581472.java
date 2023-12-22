import java.util.Scanner;

/**
 * Sum of Numbers
 */
public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        String r = "";
        int sum = 0;
        while (true) {
            r = scan.nextLine();
            if (r == "0" || r.isEmpty()) {
                return;
            }
            for (int i = 0; i < r.length(); i++) {
                sum += Integer.parseInt(r.substring(i, i + 1));
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}