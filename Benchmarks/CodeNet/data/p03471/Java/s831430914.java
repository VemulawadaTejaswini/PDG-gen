import java.util.Scanner;

/**
 *
 * @author psygn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        long amount = scanner.nextLong();

        int x = 0;
        int y = 0;
        int z = 0;

        int maxX = (int) (amount / 10000);

        boolean exitFlg = false;

        for (int i = maxX; i >= 0; i--) {
            for (int j = (int) (amount - (i * 10000)) / 5000; j >= 0; j--) {
                x = i;
                y = j;
                z = num - i - j;
                if (((x * 10000) + (y * 5000) + (z * 1000)) == amount) {
                    exitFlg = true;
                    break;
                }
            }
            if (exitFlg) {
                break;
            }
        }
        if (!exitFlg) {
            x = -1;
            y = -1;
            z = -1;
        }
        System.out.println(x + " " + y + " " + z);

    }
}
