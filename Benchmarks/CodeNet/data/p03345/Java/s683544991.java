import java.util.Scanner;

public class Main {

    private static int A;
    private static int B;
    private static int C;
    private static long K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        K = sc.nextLong();
        System.out.println(solve());
    }

    private static String solve() {
        if( K % 2 == 0 ) {
            return String.valueOf(A - B);

        } else {
            return String.valueOf(B - A);
        }
    }
}
