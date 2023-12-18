import java.util.*;
import java.util.stream.Collectors;

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
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        List<Integer> n = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .sorted(Comparator.comparingInt(x -> -x))
                .collect(Collectors.toList());
        List<Integer> o = new ArrayList<>();
        int[][] q = new int[M][2];
        for (int i = 0; i < M; i++) {
            q[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(q, Comparator.comparingInt(x -> -x[1]));
        loop:
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < q[i][0]; j++) {
                if (o.size() < N) {
                    o.add(q[i][1]);
                } else {
                    break loop;
                }
            }
        }
        while (o.size() < N) {
            o.add(0);
        }

        long ans = 0;
        int i1 = 0;
        int i2 = 0;
        while (i1 + i2 < N) {
            if (n.get(i1) > o.get(i2)) {
                ans += n.get(i1++);
            } else {
                ans += o.get(i2++);
            }
        }

        System.out.println(ans);
    }

}
