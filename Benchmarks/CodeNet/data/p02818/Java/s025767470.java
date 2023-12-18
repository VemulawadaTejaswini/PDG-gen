import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        if (A >= 1) {
            if (A >= K) {
                A -= K;
                System.out.println(A + " " + B);
                return;
            } else {
                B -= K - A;
                A = 0;
                System.out.println(A + " " + B);
                return;
            }
        } else if (B >= 1) {
            if (B >= K) {
                B -= K;
                System.out.println(A + " " + B);
                return;
            } else {
                B = 0;
                System.out.println(A + " " + B);
                return;
            }
        }
        System.out.println(0 + " " + 0);
    }

}
