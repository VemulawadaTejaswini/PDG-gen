import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int H = scanner.nextInt(), W = scanner.nextInt(), N = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> q = new ArrayDeque<>();
        boolean reverse = false;
        int index = 0;
        int cnt = 0;
        while (index < a.length) {
            while (cnt < W && a[index] > 0) {
                q.addLast(index + 1);
                cnt++;
                a[index]--;
            }
            if (cnt == W) {
                StringBuilder sb = new StringBuilder();
                while (!q.isEmpty()) {
                    if (reverse) {
                        sb.append(q.pollLast());
                    } else {
                        sb.append(q.pollFirst());
                    }
                    sb.append(' ');
                }
                System.out.println(sb.toString().trim());
                q.clear();
                cnt = 0;
                reverse = !reverse;
            }
            if (a[index] == 0) {
                index++;
            }
        }
    }
}
