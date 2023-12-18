import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char s[][] = new char[h][w];

        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }
        sc.close();

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '#') continue;
                int tmp = 0;

                for (int n = i; 0 <= n; n--) {
                    if (s[n][j] == '#') break;
                    tmp++;
                }

                for (int n = j; n < w; n++) {
                    if (s[i][n] == '#') break;
                    tmp++;
                }

                for (int n = i; n < h; n++) {
                    if (s[n][j] == '#') break;
                    tmp++;
                }

                for (int n = j; 0 <= n; n--) {
                    if (s[i][n] == '#') break;
                    tmp++;
                }

                max = Math.max(max, tmp - 3);
            }
        }

        System.out.println(max);
    }
}
