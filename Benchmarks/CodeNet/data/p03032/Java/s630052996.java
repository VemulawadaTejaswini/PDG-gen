import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), K = scanner.nextInt();
        scanner.nextLine();
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            for (int s = 0; s != N - i - 1; s = Math.floorMod(s - 1, N)) {
                int dispose = K - i;
                Queue<Integer> q = new PriorityQueue<>();
                for (int j = 0; j < i; j++) {
                    q.add(n[(s + j) % N]);
                }
                int sum = 0;
                while (!q.isEmpty()) {
                    int top = q.poll();
                    if (dispose > 0 && top < 0) {
                        dispose--;
                        continue;
                    }
                    sum += top;
                }
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }

}
