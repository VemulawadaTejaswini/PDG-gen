import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int k = s.nextInt();
        boolean f = true;

        for (int i = 0; i < k; i++) {
            if (i > b) {
                f = false;
                break;
            }
            System.out.println(a + i);

        }
        if (f) {
            while (2 * k > b - a) {
                k--;
            }

            for (int i = k - 1; i >= 0; i--) {
                if (b - i < 0) {
                    break;
                }
                System.out.println(b - i);
            }
        }
    }
}
