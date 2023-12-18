import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = a[0], K = a[1];
        String S = scanner.nextLine();
        if (!S.contains("0") || !S.contains("1")) {
            System.out.println(1);
            return;
        }
        List<Integer> starts = new ArrayList<>();
        List<Integer> ends = new ArrayList<>();
        boolean one = false;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                if (!one) {
                    one = true;
                    starts.add(i);
                }
            } else {
                if (one) {
                    ends.add(i - 1);
                    one = false;
                }
            }
        }
        if (one) {
            ends.add(N - 1);
        }

        int max = 0;
        for (int i = 0; i < starts.size(); i++) {
            int endIdx = i + K >= ends.size() ? ends.size() - 1 : i + K;
            max = Math.max(max, ends.get(endIdx) - starts.get(i) + 1);
        }

        int endIdx = K - 1 >= ends.size() ? ends.size() - 1 : K - 1;
        max = Math.max(max, ends.get(endIdx) + 1);
        int startIdx = Math.max(starts.size() - K, 0);
        max = Math.max(max, N - starts.get(startIdx));
        System.out.println(max);
    }

}