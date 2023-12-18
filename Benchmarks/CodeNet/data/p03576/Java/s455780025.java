import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[][] pos = new long[n][2];
        for (int i = 0; i < n; i++) {
            pos[i][0] = scanner.nextInt();
            pos[i][1] = scanner.nextInt();
        }

        Arrays.sort(pos, Comparator.comparingLong(a -> a[0]));
        long ans = Long.MAX_VALUE;

        for (int x1 = 0; x1 < n; x1++) {
            for (int x2 = x1 + 1; x2 < n; x2++) {
                List<Integer> ry = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (pos[x1][0] <= pos[i][0] && pos[i][0] <= pos[x2][0]) {
                        ry.add(i);
                    }
                }

                ry.sort(Comparator.comparingLong(i -> pos[i][1]));

                for (int i = 0; i < ry.size(); i++) {
                    for (int j = i + 1; j < ry.size(); j++) {
                        int y1 = ry.get(i), y2 = ry.get(j);
                        if (j - i == k - 1 && pos[y2][1] >= Math.max(pos[x1][1], pos[x2][1]) && pos[y1][1] <= Math.min(pos[x1][1], pos[x2][1])) {
                            ans = Math.min(ans, (pos[x2][0] - pos[x1][0]) * (pos[y2][1] - pos[y1][1]));
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}