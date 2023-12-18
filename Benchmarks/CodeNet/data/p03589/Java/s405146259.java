import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseN = 4 / Integer.valueOf(sc.nextLine());

        int h = (int)Math.floor(3 / baseN);
        int n = (int)Math.floor((2 * h) / (h * baseN - 1));
        int w = (int)(1 / (baseN - 1/h - 1/n));

        while (true) {
            if (n <= 0) {
                h -= 1;
                n = (int)Math.floor((2 * h) / (h * baseN - 1));
                continue;
            }
            else if (w <= 0) {
                if (n == 1) {
                    h -= 1;
                    n = (int)Math.floor((2 * h) / (h * baseN - 1));
                    w = (int)(1 / (baseN - 1/h - 1/n));
                    continue;
                }
                else {
                    n -= 1;
                    w = (int)(1 / (baseN - 1/h - 1/n));
                    continue;
                }
            }
            break;
        }

        System.out.println(h + " " + n + " " + w);
    }
}