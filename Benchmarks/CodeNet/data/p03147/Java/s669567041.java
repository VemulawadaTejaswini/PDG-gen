import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int[] list = new int[N];
        for (int i = 0; i <N; i++) {
            list[i] = Integer.parseInt(scanner.next());
        }

        int ans = 0;
        while (true) {
            int left = 0;
            while (left < N && list[left] == 0) {
                left++;
            }
            if (left == N) {
                break;
            }

            int right = left;
            int min = list[left];
            while (right < N && list[right] > 0) {
                min = Math.min(min, list[right]);
                right++;
            }
            for (int i = left; i < right; i++) {
                list[i] -= min;
            }
            ans += min;
        }
        System.out.println(ans);
    }
}

