import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                ans += (A[i] ^ A[j]);
            }
        }

        ans %= 1000000007;
        System.out.println(ans);
    }
}
