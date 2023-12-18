import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int y = sc.nextInt() / 1000;
        int tmp = y - n;

        int a = -1;
        int b = -1;
        int c = -1;
        for (int i = 0; i <= n; i++) {
            if (9 * i > tmp) {
                break;
            }

            if ((tmp - 9 * i) % 4 == 0) {
                int d = (tmp - 9 * i) / 4;
                if (i + d > n) {
                    continue;
                }

                a = i;
                b = d;
                c = n - a - b;
                break;
            }
        }

        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
