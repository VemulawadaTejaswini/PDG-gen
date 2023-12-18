import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt() * 2;
        int T2 = sc.nextInt() * 2;
        int[] xs = new int[n];
        int[] ws = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt() * 2;
            ws[i] = 3 - sc.nextInt() * 2;
        }

        int t = 0;
        List<Integer> shortests = new ArrayList<>();
        while (true) {
            // 最も近い1 → -1の場所を探す
            shortests.clear();
            int distance = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int next = (i + 1) % n;
                if (ws[next] < ws[i]) {
                    int d = (xs[next] - xs[i] + l) % l;
                    if (d == 0) {
                        d = l;
                    }
                    if (d == distance) {
                        shortests.add(i);
                    }
                    if (d < distance) {
                        shortests.clear();
                        shortests.add(i);
                        distance = d;
                    }
                }
            }
            // 衝突するまで時間をすすめる
            int dt = Math.min(T2 - t, distance / 2);
            dt = shortests.isEmpty() ? T2 - t : dt;

            t += dt;
            for (int i = 0; i < n; i++) {
                int x = xs[i] + ws[i] * dt;
                if (x < 0) {
                    xs[i] = x % l + l;
                } else {
                    xs[i] = x % l;
                }
            }
            for (int i = 0; i < n; i++) {
                int next = (i + 1) % n;
                if (shortests.contains(i)) {
                    ws[i] *= -1;
                    ws[next] *= -1;
                }
            }
            // System.out.println(t / 2.0 + ": " + Arrays.stream(xs).mapToObj(x -> (x / 2.0) + "").collect(Collectors.joining(" ")));

            if (t == T2) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(xs[i] / 2);
        }
    }
}
