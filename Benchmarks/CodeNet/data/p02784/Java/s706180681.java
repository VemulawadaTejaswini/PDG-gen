import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum >= H ? "Yes" : "No");
    }
}
