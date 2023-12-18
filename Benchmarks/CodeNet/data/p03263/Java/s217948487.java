import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int[] x = new int[h * w];
        int[] y = new int[h * w];

        for (int i = 0; i < h; i++) {
            Arrays.fill(x, i * w, i * w + w, i);
            for (int j = 0; j < w; j++) {
                y[i * w + j] = i % 2 == 0 ? j : w - j - 1;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < h * w - 1; i++) {
            if (a[x[i]][y[i]] % 2 == 1) {
                ans.add(i);
                a[x[i + 1]][y[i + 1]]++;
            }
        }

        System.out.println(ans.size());
        for (int i : ans) {
            System.out.println((x[i] + 1) + " " + (y[i] + 1) + " " + (x[i + 1] + 1) + " " + (y[i + 1] + 1));
        }
    }
}