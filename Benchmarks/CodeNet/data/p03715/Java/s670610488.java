import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long H = Math.max(l[0], l[1]);
        long W = Math.min(l[0], l[1]);
        if (H % 3 == 0 || W % 3 == 0) {
            System.out.println(0);
            return;
        }
        long f1 = H / 3 * W;
        long s1 = H - (H / 3) / 2 * W;
        long t1 = H * W - f1 - s1;

        long min = Long.MAX_VALUE;
        long minIndex = 1;
        for (int i = 1; i < H; i++) {
            long diff = W * (H - i) - 2 * W * i;
            if (diff >= 0 && min > diff) {
                min = diff;
                minIndex = i;
            }
        }

        long f2 = minIndex * W;
        long h = Math.max(H - minIndex, W);
        long w = Math.min(H - minIndex, W);
        long area = h * w;
        long s2;
        long t2;
        if (h % 2 == 0 || w % 2 == 0) {
            s2 = area / 2;
            t2 = area / 2;
        } else {
            s2 = h / 2 * w;
            t2 = area - s2;
        }

        System.out.println(Math.min(maxDiff(f1, s1, t1), maxDiff(f2, s2, t2)));
    }

    static long maxDiff(long a, long b, long c) {
        return Math.max(Math.max(Math.abs(a - b), Math.abs(a - c)), Math.abs(b - c));
    }

}
