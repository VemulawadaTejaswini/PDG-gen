import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        long min = 0;
        long max = 0;
        long sum = 0;                                                  

        for (int i = 0; i < range; i += 1) {
            int tmp = scan.nextInt();
            if (i == 0) {
                min = tmp;
                max = tmp;
                sum += tmp;
            } else {
                if (min > tmp) {
                    min = tmp;
                }
                if (max < tmp) {
                    max = tmp;
                }
                sum += tmp;
            }
        }

        out.printf("%d %d %d%n", min, max, sum);
    }
}