import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blue = sc.nextInt();
        int red = sc.nextInt();
        int o = 0;
        int blueB = 0;
        int redB = 0;

        if (n > 0) {
            if (blue > 0) {
                n -= blue;
                blueB = blue;
                o = n - red;
                blueB += o;
            }
            else if (blue == 0) {
                blueB = 0;
            }
        }
        System.out.println(blueB);
    }
}
