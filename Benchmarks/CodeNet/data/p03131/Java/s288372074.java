import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        long K = scan.nextLong();
        final long A = scan.nextLong();
        final long B = scan.nextLong();

        if (B - A <= 2L) {
            System.out.println(K + 1L);
            return;
        }

        long biscuit = 1L;
        long jpy = 0L;

        while (K > 0L) {
            if (jpy > 0L) {
                jpy--;
                biscuit += B;
                K--;
                continue;
            }

            if (biscuit >= A && K >= 2L) {
                biscuit -= A;
                jpy++;
                K--;
                continue;
            }

            biscuit++;
            K--;
        }
        System.out.println(biscuit);
    }
}