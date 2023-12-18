import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            double result = 0;

            double test = (int) Math.pow(10, 9);
            double tmp1 = 1;
            double tmp2 = 1;

            int tmpn = n;

            for (int i = 1; i <= n; i++) {

                tmp1 = tmp2 * tmpn / i;
                if (i != a && i != b) {
                    result += tmp1;
                }

                tmp2 = tmp1;

                tmpn--;
            }

            result = (double) result % (test + 7);
            System.out.println((long) result);

        }
    }

}