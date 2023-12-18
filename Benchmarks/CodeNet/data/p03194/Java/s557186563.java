import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long P = sc.nextLong();

        long M = (long) Math.floor(Math.pow(P, 1.0 / N));
        while (M > 1) {
            long a = (long) Math.pow(M, N);
            if (P % a == 0) {
                break;
            }
            M -= 1;
        }
        System.out.println(M);
    }
}
