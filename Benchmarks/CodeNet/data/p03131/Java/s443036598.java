import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        long K = scan.nextInt();
        final long A = scan.nextInt();
        final long B = scan.nextInt();

        long biscuit = 1;
        long jpy = 0;

        if (B - A <= 2) {
            while (K > 0) {
                biscuit++;
                K--;
            }
            System.out.println(biscuit);
            return;
        }

        while (K > 0) {
            if (jpy > 0) {
                jpy--;
                biscuit += B;
                K--;
                continue;
            }

            if (biscuit < A || K < A) {
                biscuit++;
                K--;
                continue;
            }
            if (biscuit >= A) {
                biscuit = biscuit - A;
                jpy++;
                K--;
            }
        }
        System.out.println(biscuit);
    }
}