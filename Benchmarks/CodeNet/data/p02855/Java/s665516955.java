import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }
        int num = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ("#".equals(s[i][j])) {
                    s[i][j] = String.valueOf(num++);
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (".".equals(s[i][j])) {
                    s[i][j] = s[i][j - 1];
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = w - 2; j >= 0; j--) {
                if (".".equals(s[i][j])) {
                    s[i][j] = s[i][j + 1];
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 1; j < h; j++) {
                if (".".equals(s[j][i])) {
                    s[j][i] = s[j - 1][i];
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = h - 2; j >= 0; j--) {
                if (".".equals(s[j][i])) {
                    s[j][i] = s[j + 1][i];
                }
            }
        }
        for (int i = 0; i < h; i++) {
            StringJoiner sj = new StringJoiner(" ");
            for (int j = 0; j < w; j++) {
                sj.add(s[i][j]);
            }
            System.out.println(sj);
        }
    }

}
