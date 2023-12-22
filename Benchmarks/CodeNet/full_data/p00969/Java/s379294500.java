import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            int n = in.nextInt();
            int[] v = new int[n];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                v[i] = in.nextInt();
                set.add(v[i]);
            }
            for (int i = 1; i < n; i++) swap(v, (int) (Math.random() * (i - 1)), i);
            Arrays.sort(v);

            int ans = 2;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int d = v[j] - v[i];
                    if (set.contains(v[i] - d)) continue;
                    int cnt = 2, cur = v[j];
                    while (set.contains(cur + d)) {
                        cur += d;
                        cnt++;
                    }
                    ans = Math.max(ans, cnt);
                }
            }
            out.println(ans);
        }
    }

    private static void swap(int[] a, int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
}

