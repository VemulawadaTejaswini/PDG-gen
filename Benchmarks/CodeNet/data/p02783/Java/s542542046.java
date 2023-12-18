import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int h = scanner.nextInt();
    }

    public int a(int a, int h) {
        if (h == a) {
            return 1;
        } else if (h <= a) {
            return 1;
        } else if (h >= a) {
            int k;
            int i;
            k = (h / a) + 1;
            int b;
            int c = 0;
            b = (h - a);
            for (i = 0; i < k; i++) {
                b -= a;
                c = c + 1;
                return c;
            }
        }
        return 1;
    }

}
