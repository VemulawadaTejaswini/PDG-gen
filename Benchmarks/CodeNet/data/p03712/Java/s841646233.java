import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int W = in.nextInt();
            char[][] a = new char[H][W];
            for (int r = 0; r < H; r++) {
                a[r] = in.next().toCharArray();
            }

            char[][] b = new char[H + 2][W + 2];
            for (int r = 0; r < b.length; r++) {
                for (int c = 0; c < b[r].length; c++) {
                    b[r][c] = '#';
                }
            }
            for (int r = 0; r < a.length; r++) {
                for (int c = 0; c < a[r].length; c++) {
                    b[r + 1][c + 1] = a[r][c];
                }
            }

            StringBuilder res = new StringBuilder();
            for (int r = 0; r < b.length; r++) {
                for (int c = 0; c < b[r].length; c++) {
                    res.append(b[r][c]);
                }
                res.append("\n");
            }

            System.out.println(res.toString());
        }
    }
}
