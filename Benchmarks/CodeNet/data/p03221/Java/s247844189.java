import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] c = new int[m][4];
        for (int i = 0; i < m; i++) {
            c[i][0] = i;
            c[i][1] = sc.nextInt();
            c[i][2] = sc.nextInt();
        }
        // pref,yearでソート
        Arrays.sort(c, (c1, c2) -> {
            if (c1[1] != c2[1]) {
                return c1[1] - c2[1];
            }
            return c1[2] - c2[2];
        });
        // 識別番号下6桁の番号を付与
        c[0][3] = 1;
        for (int i = 1; i < m; i++) {
            if (c[i][1] == c[i - 1][1]) {
                c[i][3] = c[i - 1][3] + 1;
                continue;
            }
            c[i][3] = 1;
        }

        // もとの順番に戻す
        Arrays.sort(c, Comparator.comparingInt(c0 -> c0[0]));

        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%06d", c[i][1]) + String.format("%06d", c[i][3]));
        }

    }

}
