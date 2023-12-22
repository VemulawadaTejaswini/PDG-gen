import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();


        int TURU = 2;
        int KAME = 4;
        for (int t = 0; t <= x; t++) {
            int k = x - t;
            int r = t * TURU + k * KAME;
            if (r == y) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}