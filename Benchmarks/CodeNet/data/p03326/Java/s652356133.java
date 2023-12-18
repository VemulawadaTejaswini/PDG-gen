import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int N;
    static int M;
    static List<long[]> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            list.add(new long[]{x, y, z});
        }

        solve();
    }

    static void solve() {
        List<int[]> signs = new ArrayList<>();
        signs.add(new int[]{ 1,  1,  1});
        signs.add(new int[]{ 1,  1, -1});
        signs.add(new int[]{ 1, -1,  1});
        signs.add(new int[]{ 1, -1, -1});
        signs.add(new int[]{-1,  1,  1});
        signs.add(new int[]{-1,  1, -1});
        signs.add(new int[]{-1, -1,  1});
        signs.add(new int[]{-1, -1, -1});

        long max = 0;
        for (int[] sign : signs) {
            max = Math.max(
                    max,
                    list.stream()
                        .map(xyz -> xyz[0] * sign[0] + xyz[1] * sign[1] + xyz[2] * sign[2])
                        .sorted(Comparator.reverseOrder())
                        .limit(M)
                        .mapToLong(Long::longValue)
                        .sum()
            );
        }

        System.out.println(max);
    }
}