import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();
            long A1 = sc.nextLong();
            long A2 = sc.nextLong();
            long B1 = sc.nextLong();
            long B2 = sc.nextLong();

            if ((A1 * T1 + A2 * T2) == (B1 * T1 + B2 * T2)) {
                System.out.println("infinity");
                return;
            }

            if (A1 > B1) {
                long tmp = A1;
                A1 = B1;
                B1 = tmp;

                tmp = A2;
                A2 = B2;
                B2 = tmp;
            }

            if (B2 >= A2) {
                System.out.println(0);
                return;
            }

            long d1 = (B1 - A1) * T1;
            long d2 = (A2 - B2) * T2;

            if (d1 - d2 > 0) {
                System.out.println(0);
                return;
            }

            long ans = (d1 / (d2 - d1)) * 2 + 1;

            System.out.println(ans);
        }
    }

}
