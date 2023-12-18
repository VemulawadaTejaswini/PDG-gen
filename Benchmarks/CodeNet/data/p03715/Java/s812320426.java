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
        int minSplit = 1;
        long min = Long.MAX_VALUE;
        for (int i = 1; i < H; i++) {
            long cut = i * W;
            long rest = (H - i) * W;
            if (min > Math.abs(rest - 2 * cut)) {
                min = Math.abs(rest - 2 * cut);
                minSplit = i;
            }
        }

        long first = minSplit * W;
        long remMax = Math.max(H - minSplit, W);
        long remMin = Math.min(H - minSplit, W);
        long area = remMax * remMin;
        long third = (remMax % 2 == 0 || remMin % 2 == 0) ? area / 2 : remMax / 2 * remMin;
        System.out.println(Math.abs(first - third));
    }

}
