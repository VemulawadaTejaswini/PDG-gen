import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long mod = 1000000000 + 7;
        int[] a = new int[M];
        boolean[] floors = new boolean[N + 1];
        Arrays.fill(floors, true);
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
            floors[a[i]] = false;
        }

        Arrays.sort(a);
        int tmp = a[0];
        for (int i : a) {
            if ((i - tmp) == 1) {
                System.out.println(0);
                return;
            }
            tmp = i;
        }

        long ans = 1L;
        int now = 0;
        while (now < N - 1) {
            System.out.println(now);
            if (!floors[now + 1] && !floors[now + 2]) {
                System.out.println(0);
                return;
            }
            if (floors[now + 1] && floors[now + 2]) {
                ans = ((ans % mod) * 2) % mod;
                now += 2;
                continue;
            }
            now += floors[now + 1] ? 1 : 2;
        }

        System.out.println(ans);
    }
}