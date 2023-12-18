import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            long K = in.nextLong();

            // bc ac ab
            // aabc abbc abcc
            // aabbbccc aaabbccc aaabbbcc
            //
            if (K % 2 == 0) {
                if (Math.abs(A - B) > 1e18) {
                    System.out.println("Unfair");
                    return;
                }
                System.out.println(A - B);
                return;
            }
            if (Math.abs(B - A) > 1e18) {
                System.out.println("Unfair");
                return;
            }
            System.out.println(B - A);
            return;
        }
    }

    private static int f(int n) {
        return (int) Math.floor((n * n + 4.0) / 8.0);
    }
}
