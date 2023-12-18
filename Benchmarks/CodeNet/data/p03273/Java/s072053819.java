import java.io.PrintStream;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int h = sn.nextInt();
        int w = sn.nextInt();
        char[][] mat = new char[h][w];
        boolean[] rowVisible = new boolean[h];
        boolean[] colVisible = new boolean[w];
        // 読み込み
        for (int i = 0; i < h; i++) {
            String row = sn.next();
            for (int j = 0; j < w; j++) {
                char c = row.charAt(j);
                mat[i][j] = c;
                if (c == '#') {
                    rowVisible[i] = true;
                    colVisible[j] = true;
                }
            }
        }
        sn.close();
        // 表示
        PrintStream out = System.out;
        for (int i = 0; i < h; i++) {
            if (!rowVisible[i]) continue;
            for (int j = 0; j < w; j++) {
                if (!colVisible[j]) continue;
                out.print(mat[i][j]);
            }
            out.print("\n");
        }
    }
}
