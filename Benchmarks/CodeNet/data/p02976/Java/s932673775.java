import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        int m = sc.nextInt();
        int[] counts = new int[n];

        Set<Integer>[] points = new Set[n];

        if (n % 2 != 1) {
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < n; i++) {
            points[i] = new HashSet<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            points[a].add(b);
            points[b].add(a);
        }

//        debug(points);
        for (int i = 0; i < n; i++) {
//            debug(i, points[i].size() + counts[i]);
            if ((points[i].size() + counts[i]) % 2 == 0) {
                for (int opposite : points[i]) {
                    points[opposite].remove(i);
                    counts[i]++;
                    System.out.println(i + " " + opposite);
                }
            } else {
                for (int opposite : points[i]) {
                    points[opposite].remove(i);
                    counts[opposite]++;
                    System.out.println(opposite + " " + i);
                }
            }
            points[i] = new HashSet();
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
