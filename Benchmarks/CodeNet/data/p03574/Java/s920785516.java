import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] board = new String[h][w];

        for (int i = 0; i < h; i++) {
            board[i] = sc.next().split("");
        }

        sc.close();

        int[] dx = { 1, 0, 1, -1, -1, -1, 0, 1 };
        int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j].equals(".")) {
                    int cnt = 0;
                    for (int k = 0; k < 8; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];

                        if (x < h && x >= 0 && y < w && y >= 0 && board[x][y].equals("#")) {
                            cnt++;
                        }
                    }
                    board[i][j] = String.valueOf(cnt);
                }
            }
        }

        for (String[] strArray : board) {
            for (String str : strArray) {
                System.out.print(str);
            }
            System.out.println("");
        }
    }

}