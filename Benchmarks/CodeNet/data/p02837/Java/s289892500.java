import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] xy = new int[n][n];
        for (int[] ary : xy) {
            Arrays.fill(ary, -1);
        }
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            for (int j = 0; j < a; j++) {
                int x = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());
                xy[i][x - 1] = y;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (xy[i][j] != -1 && xy[j][i] != -1 && xy[i][j] == xy[j][i]) {
                        ans++;
                        if (xy[i][j] == 0) {
                            xy[j][i] = -1;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}