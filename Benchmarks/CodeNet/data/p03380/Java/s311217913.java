import java.util.Scanner;

public class Main {
    //D - Binomial Coefficients
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] ai = new long[n];
        long maxA = 0;
        int maxI = 0;
        for(int i = 0; i < n; i++) {
            ai[i] = scanner.nextLong();
            if (ai[i] > maxA) {
                maxA = ai[i];
                maxI = i;
            }
        }

        int maxJ = 0;
        long nearest = Long.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            long d = Math.abs(maxA / 2 - ai[i]);
            if ( d == 0 ) {
                maxJ = i;
                break;
            }
            else if ( maxI != i && d < nearest ) {
                nearest = d;
                maxJ = i;
            }
        }
        System.out.printf("%d %d\n", maxA, ai[maxJ]);
    }
}
