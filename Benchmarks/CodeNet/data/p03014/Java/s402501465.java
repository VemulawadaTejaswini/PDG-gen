import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String s[][] = new String[h][w];

        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j].equals("#")) continue;
                int tmp = 1;

                for (int n = i - 1; 0 <= n; n--) {
                    if (s[n][j].equals("#")) break;
                    tmp++;
                }

                for (int n = j + 1; n < w; n++) {
                    if (s[i][n].equals("#")) break;
                    tmp++;
                }

                for (int n = i + 1; n < h; n++) {
                    if (s[n][j].equals("#")) break;
                    tmp++;
                }

                for (int n = j - 1; 0 <= n; n--) {
                    if (s[i][n].equals("#")) break;
                    tmp++;
                }

                max = Math.max(max, tmp);
            }
        }

        System.out.println(max);
    }
}
