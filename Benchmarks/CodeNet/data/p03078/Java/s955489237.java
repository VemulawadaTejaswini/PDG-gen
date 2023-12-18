import java.util.*;
import java.util.stream.Collectors;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 16MB stack
        Thread thread = new Thread(null, new Main(), "", 16 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    static class Points {
        int x;
        int y;
        int z;

        public Points(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Points points = (Points) o;
            return x == points.x &&
                    y == points.y &&
                    z == points.z;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, z);
        }
    }
    // int a = Integer.parseInt(scanner.nextLine());
    // int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int K = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()[3];
        long[] a = Arrays.stream(scanner.nextLine().split(" "))
                .map(Long::parseLong)
                .sorted(Comparator.comparing(x -> -x))
                .mapToLong(x -> x)
                .toArray();
        long[] b = Arrays.stream(scanner.nextLine().split(" "))
                .map(Long::parseLong)
                .sorted(Comparator.comparing(x -> -x))
                .mapToLong(x -> x)
                .toArray();
        long[] c = Arrays.stream(scanner.nextLine().split(" "))
                .map(Long::parseLong)
                .sorted(Comparator.comparing(x -> -x))
                .mapToLong(x -> x)
                .toArray();

        Set<Points> used = new HashSet<>();
        used.add(new Points(0, 0, 0));
        Queue<Points> q = new PriorityQueue<>(Comparator.comparing(x -> -(a[x.x] + b[x.y] + c[x.z])));
        q.add(new Points(0, 0, 0));
        for (int i = 0; i < K; i++) {
            Points p = q.poll();
            System.out.println(a[p.x] + b[p.y] + c[p.z]);
            if (p.x < a.length - 1 && used.add(new Points(p.x + 1, p.y, p.z))) {
                q.add(new Points(p.x + 1, p.y, p.z));
            }
            if (p.y < b.length - 1 && used.add(new Points(p.x, p.y + 1, p.z))) {
                q.add(new Points(p.x, p.y + 1, p.z));
            }
            if (p.z < c.length - 1 && used.add(new Points(p.x, p.y, p.z + 1))) {
                q.add(new Points(p.x, p.y, p.z + 1));
            }
        }
    }

}
