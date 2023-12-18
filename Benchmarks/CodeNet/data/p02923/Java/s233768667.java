import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] H = new long[N];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextLong();
        }

        int count = 0;
        for (int i = 1; i < N; i++) {
            if (H[i - 1] >= H[i]) {
                count++;
            } else {
                ans = Math.max(count, ans);
                count = 0;
            }
        }
        ans = Math.max(count, ans);

        System.out.println(ans);
    }
}