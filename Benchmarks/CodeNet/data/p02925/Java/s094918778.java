import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.nextLine();

        int[][] A = new int[N][N - 1];
        for (int i = 0; i < N; i++) {
            A[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(x -> Integer.parseInt(x) - 1)
                    .toArray();
        }

        int days = 0;
        int[] idxs = new int[N];
        Set<Integer> added = new HashSet<>();
        while (true) {
            boolean updated = false;
            for (int i = 0; i < N; i++) {
                int me = i;
                if (idxs[i] >= N - 1) {
                    continue;
                }
                int op = A[i][idxs[i]];
                if (idxs[op] >= N - 1) {
                    continue;
                }
                int opop = A[op][idxs[op]];
                if (added.contains(me) || added.contains(op)) {
                    continue;
                }
                if (me == opop) {
                    added.add(me);
                    added.add(op);
                    idxs[me]++;
                    idxs[op]++;
                    updated = true;
                }
            }
            if (!updated) {
                break;
            }
            days++;
            added.clear();
        }

        for (int i: idxs) {
            if (i < N - 1) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(days);

    }

}

