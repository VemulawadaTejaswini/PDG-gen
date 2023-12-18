import java.util.*;
import java.util.stream.LongStream;

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
        int N = Integer.parseInt(scanner.nextLine());
        List<List<List<Integer>>> n = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(scanner.nextLine());
            List<List<Integer>> list = new ArrayList<>();
            for (int j = 0; j < A; j++) {
                int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                List<Integer> l = new ArrayList<>();
                l.add(a[0] - 1);
                l.add(a[1]);
                list.add(l);
            }
            n.add(list);
        }

        int ans = 0;
        loop:
        for (int i = 0; i < (1 << N); i++) {
            for (int j = 0; j < N; j++) {
                boolean t = ((1 << j) & i) > 0;
                if (t) {
                    for (List<Integer> l: n.get(j)) {
                        if (l.get(1) == 1) {
                            if (((1 << j) & l.get(0)) == 0) {
                                continue loop;
                            }
                        } else {
                            if (((1 << j) & l.get(0)) > 0) {
                                continue loop;
                            }
                        }
                    }
                } else {
                    for (List<Integer> l: n.get(j)) {
                        if (l.get(1) == 1) {
                            if (((1 << j) & l.get(0)) > 0) {
                                continue loop;
                            }
                        } else {
                            if (((1 << j) & l.get(0)) == 0) {
                                continue loop;
                            }
                        }
                    }
                }
            }
            ans = Math.max(ans, Integer.bitCount(i));
        }

        System.out.println(ans);
    }

}
