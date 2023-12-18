import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] board = new String[h][w];
        boolean[] chkX = new boolean[h];
        boolean[] chkY = new boolean[w];

        for (int i = 0; i < h; i++) {
            board[i] = sc.next().split("");
        }

        sc.close();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j].equals("#")) {
                    chkX[i] = true;
                    chkY[j] = true;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            if (chkX[i]) {
                for (int j = 0; j < w; j++) {
                    if (chkY[j]) {
                        System.out.print(board[i][j]);
                    }
                }
                System.out.println("");
            }
        }
    }
}