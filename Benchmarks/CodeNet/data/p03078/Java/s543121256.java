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
        int[] XYZK = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Long> a = Arrays.stream(scanner.nextLine().split(" ")).map(Long::parseLong).sorted(Comparator.comparingLong(x -> -x)).collect(Collectors.toList());
        List<Long> b = Arrays.stream(scanner.nextLine().split(" ")).map(Long::parseLong).sorted(Comparator.comparingLong(x -> -x)).collect(Collectors.toList());
        List<Long> c = Arrays.stream(scanner.nextLine().split(" ")).map(Long::parseLong).sorted(Comparator.comparingLong(x -> -x)).collect(Collectors.toList());

        Set<Long> visited = new HashSet<>();
        Queue<long[]> q = new PriorityQueue<>(Comparator.comparingLong(x -> -x[0]));
        q.add(new long[]{a.get(0) + b.get(0) + c.get(0), 0, 0, 0});
        int k = 0;
        while (k < XYZK[3]) {
            long[] top = q.poll();
            if (!visited.add((top[1] << 24) + (top[2] << 12) + top[3])) {
                continue;
            }
            System.out.println(top[0]);
            k++;
            if (top[1] < XYZK[0] - 1) {
                q.add(new long[]{
                        a.get((int) top[1] + 1) + b.get((int) top[2]) + c.get((int) top[3]),
                        top[1] + 1,
                        top[2],
                        top[3]
                });
            }
            if (top[2] < XYZK[1] - 1) {
                q.add(new long[]{
                        a.get((int) top[1]) + b.get((int) top[2] + 1) + c.get((int) top[3]),
                        top[1],
                        top[2] + 1,
                        top[3]
                });
            }
            if (top[3] < XYZK[2] - 1) {
                q.add(new long[]{
                        a.get((int) top[1]) + b.get((int) top[2]) + c.get((int) top[3] + 1),
                        top[1],
                        top[2],
                        top[3] + 1
                });
            }
        }
    }

}
