import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        int[][] qs = new int[M][2];
        for (int i = 0; i < M; i++) {
            qs[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(qs, Comparator.comparingInt(x -> x[1]));
        int ans = 1;
        int end = qs[0][1];
        for (int i = 1; i < M; i++) {
            int[] q = qs[i];
            if (q[0] < end) {
                continue;
            }
            ans++;
            end = q[1];
        }
        System.out.println(ans);
    }

}