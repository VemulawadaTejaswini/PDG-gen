import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] red = new int[n][2];
        int[][] blue = new int[n][2];

        for (int i = 0; i < n; i++) {
            red[i][0] = sc.nextInt();
            red[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            blue[i][0] = sc.nextInt();
            blue[i][1] = sc.nextInt();
        }

        // yの昇順
        Arrays.sort(red, (x, y) -> x[1] - y[1]);
        // xの昇順
        Arrays.sort(blue, (x, y) -> x[0] - y[0]);

        int cnt = 0;
        boolean[] isUse = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (blue[i][0] > red[j][0] && blue[i][1] > red[j][1] && !isUse[j]) {
                    isUse[j] = true;
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
