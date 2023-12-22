import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = scanner.nextInt();
        }

        Set<Integer>[] near = new HashSet[N];
        for (int i = 0; i < N; i++) {
            near[i] = new HashSet<>();
        }

        for (int i = 0; i < M; i++) {
            int p1 = scanner.nextInt();
            int p2 = scanner.nextInt();

            near[p1 - 1].add(p2);
            near[p2 - 1].add(p1);
        }

        int goods = 0;
        for (int i = 0; i < N; i++) {
            final int idx = i;
            long count = near[i].stream().map(integer -> H[integer - 1])
                    // お作法的に良くないやつ
                    .filter(integer -> integer >= H[idx])
                    .count();

            if (count == 0) {
                goods++;
            }
        }

        System.out.println(goods);
    }
}
