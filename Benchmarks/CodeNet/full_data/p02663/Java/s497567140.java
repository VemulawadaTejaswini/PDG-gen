import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H1 = sc.nextInt();
        int M1= sc.nextInt();
        int H2= sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solve(H1, M1, H2, M2, K));
    }

    private static int solve(int H1, int M1, int H2, int M2, int K) {
        int from = H1*60 + M1;
        int to = H2*60 + M2;


        return to - from - K;
    }
}