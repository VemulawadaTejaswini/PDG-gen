import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] AB = new long[N + 1];
        long ans = 0;
        long a = 0;
        int c = 1;
        AB[0] = 0;
        for (int i = 1; i <= N; i++) {
            A[i - 1] = sc.nextLong();
            AB[i] = A[i - 1] + AB[i - 1];
        }
        Arrays.sort(AB);
        lavel:
        for (int i = 1; i <= N; i++) {
            if (AB[i] == AB[i - 1]) {
                c++;
            } else {
                ans += c * (c - 1) / 2;
                c = 1;
            }
        }
        ans += c * (c - 1) / 2;
        System.out.println(ans);
    }
}