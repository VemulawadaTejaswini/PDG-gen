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
        int N = scanner.nextInt(), Q = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int i = 0; i < N; i++) {
            edges.put(i + 1, new HashSet<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            edges.get(e[0]).add(e[1]);
        }

        int[] sum = new int[N + 1];
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sum[q[0]] += q[1];
        }


        Set<Long> es = edges.get(1).stream().map(x -> (1L << 32) + x).collect(Collectors.toSet());
        while (!es.isEmpty()) {
            Set<Long> nes = new HashSet<>();
            for (long e: es) {
                int parent = (int) (e >> 32);
                int curr = (int) e;
                sum[curr] += sum[parent];
                nes.addAll(edges.get(curr).stream().map(x -> (((long) curr) << 32) + x).collect(Collectors.toSet()));
            }
            es = nes;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(sum[i]);
            sb.append(' ');
        }
        System.out.println(sb.toString().trim());
    }

}
