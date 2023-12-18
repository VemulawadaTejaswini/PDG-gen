import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] hw = new int[h][w];
        int idx = 1;
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    while (a[idx] == 0) {
                        idx++;
                    }
                    hw[i][j] = idx;
                    a[idx]--;
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    while (a[idx] == 0) {
                        idx++;
                    }
                    hw[i][j] = idx;
                    a[idx]--;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            StringJoiner sj = new StringJoiner(" ");
            for (int j = 0; j < w; j++) {
                sj.add(String.valueOf(hw[i][j]));
            }
            System.out.println(sj);
        }
    }

}
