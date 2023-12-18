import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    private static final String BOMB = "#";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }

        for (int i = 0; i < h; i++) {
            StringJoiner sj = new StringJoiner("");
            for (int j = 0; j < w; j++) {
                if (s[i][j].equals(BOMB)) {
                    sj.add(BOMB);
                    continue;
                }
                int count = 0;
                if (j > 0 && s[i][j - 1].equals(BOMB)) {
                    count++;
                }
                if (j < w - 1 && s[i][j + 1].equals(BOMB)) {
                    count++;
                }
                if (i > 0 && j > 0 && s[i - 1][j - 1].equals(BOMB)) {
                    count++;
                }
                if (i > 0 && s[i - 1][j].equals(BOMB)) {
                    count++;
                }
                if (i > 0 && j < w - 1 && s[i - 1][j + 1].equals(BOMB)) {
                    count++;
                }
                if (i < h - 1 && j > 0 && s[i + 1][j - 1].equals(BOMB)) {
                    count++;
                }
                if (i < h - 1 && s[i + 1][j].equals(BOMB)) {
                    count++;
                }
                if (i < h - 1 && j < w - 1 && s[i + 1][j + 1].equals(BOMB)) {
                    count++;
                }
                sj.add(String.valueOf(count));
            }
            System.out.println(sj.toString());
        }
    }

}
