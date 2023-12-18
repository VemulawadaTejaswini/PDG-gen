import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        final int Q = sc.nextInt();

        boolean reversed = false;
        for (int i = 0; i < Q; i++) {
            final int T = sc.nextInt();

            if (T == 1) {
                reversed = true;
            }

            if (T == 2) {
                final int F = sc.nextInt();
                final String C = sc.next();

                if (F == 1) {
                    if (reversed) {
                        S = S + C;
                    } else {
                        S = C + S;
                    }
                }

                if (F == 2) {
                    if (reversed) {
                        S = C + S;
                    } else {
                        S = S + C;
                    }
                }
                reversed = false;
            }
        }

        if (reversed) {
            S = new StringBuffer(S).reverse().toString();
        }

        System.out.println(S);
    }
}