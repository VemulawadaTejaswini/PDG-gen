import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int ans = 0;
        int min = N;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, P[i]);
            if (P[i] <= min) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
