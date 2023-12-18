import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        final int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            final int T = sc.nextInt();

            if (T == 1) {
                S = new StringBuffer(S).reverse().toString();
            }

            if (T == 2) {
                final int F = sc.nextInt();
                final String C = sc.next();

                if (F == 1) {
                    S = C + S;
                }

                if (F == 2) {
                    S = S + C;
                }
            }
        }

        System.out.println(S);
    }
}
