import java.util.Scanner;

/**
 * Shuffle
 */
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.equals("-")) {
                break;
            }

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int h = sc.nextInt();
                str = str.substring(h) + str.substring(0, h);
            }

            System.out.println(str);
        }

        sc.close();
    }
}
