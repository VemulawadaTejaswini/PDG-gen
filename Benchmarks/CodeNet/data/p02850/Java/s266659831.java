import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ans = new int[n - 1];
        Set<Integer>[] colors = new Set[n];
        int[] counts = new int[n];

        for (int i = 0; i < n; i++) {
            colors[i] = new HashSet<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            counts[a]++;
            counts[b]++;
            int x = counts[a];
            for (int j = 1; j < counts[a]; j++) {
                if (!colors[a].contains(j)) {
                    x = j;
                    break;
                }
            }
            colors[a].add(x);
            colors[b].add(x);
            ans[i] = x;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(counts[i], max);
        }

        System.out.println(max);
        for (int i = 0; i < n - 1; i++) {
            System.out.println(ans[i]);
        }
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}