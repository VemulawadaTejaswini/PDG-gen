import java.util.Scanner;

/**
 * Table Tennis Training
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            long A = sc.nextLong();
            long B = sc.nextLong();

            long ans;

            if ((B - A) % 2 == 0) {
                ans = (B - A) / 2;
            } else {
                ans = Math.min(A - 1, N - B) + 1 + (B - A - 1) / 2;
            }

            System.out.println(ans);
        }
    }

}
