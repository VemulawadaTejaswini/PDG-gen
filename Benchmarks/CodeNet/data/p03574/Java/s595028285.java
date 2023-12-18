import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        String[] s = new String[H];
        String[][] S = new String[H][W];
        int[] dx = { 1, 0, -1, 0, 1, -1, -1, 1 };
        int[] dy = { 0, 1, 0, -1, 1, 1, -1, -1 };
        Integer count;
        String line = "";

        for (int i = 0; i < H; i++) {
            s[i] = sc.next();
            for (int j = 0; j < W; j++) {
                S[i][j] = s[i].split("")[j];
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                count = 0;
                for (int d = 0; d < 8; d++) {
                    int nx = j + dx[d];
                    int ny = i + dy[d];

                    if (nx >= 0 && nx < W && ny >= 0 && ny < H) {
                        if (S[ny][nx].equals("#") && !S[i][j].equals("#")) {
                            count++;
                        }
                    }

                    if (!S[i][j].equals("#")) {
                        S[i][j] = count.toString();
                    }

                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < H; i++) {

            line = "";
            for (int j = 0; j < W; j++) {
                line += S[i][j];
            }

            out.println(line);
        }

        sc.close();
        out.flush();
    }
}