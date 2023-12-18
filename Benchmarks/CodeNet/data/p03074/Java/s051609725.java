import java.util.*;
import java.util.stream.Collectors;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 16MB stack
        Thread thread = new Thread(null, new Main(), "", 16 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = a[0], K = a[1];
        String S = scanner.nextLine();
        if (!S.contains("0") || !S.contains("1")) {
            System.out.println(N);
            return;
        }

        S = "1".concat(S).concat("1");
        List<Integer> starts = new ArrayList<>();
        List<Integer> ends = new ArrayList<>();
        boolean one = false;
        for (int i = 0; i < S.length(); i++) {
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
            ends.add(S.length() - 1);
        }

        int max = 0;
        for (int i = 0; i < starts.size(); i++) {
            int endIdx = Math.min(i + K, ends.size() - 1);
            int ans = ends.get(endIdx) - starts.get(i) + 1;
            if (i == 0) {
                ans--;
            }
            if (endIdx == ends.size() - 1) {
                ans--;
            }
            max = Math.max(max, ans);
        }

        System.out.println(max);
    }

}
