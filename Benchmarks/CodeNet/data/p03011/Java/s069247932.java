import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int ans = solve(P, Q, R);

        System.out.println(ans);
    }

    private static int solve(int P, int Q, int R) {
        return Math.min(P+Q, Math.min(Q+R, R+P));
    }
}
