
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int N = 50;
    public static int H, W;
    public static char[][] board = new char[N][N];
    public static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    public static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {

        //入力
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        for(int i = 0; i < H; i++) {
          String S = sc.next();
          board[i] = S.toCharArray();
        }

        //出力
        solve();
    }

    public static void solve() {
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(board[i][j] == '.') {
                    int count = 0;
                    for(int k = 0; k < 8; k++) {
                        int x = i + dx[k], y = j + dy[k];
                        if(x >= 0 && x < H && y >= 0 && y < W && board[x][y] == '#') count++;
                    }
                    board[i][j] = (char)('0' + count);
                }
            }
        }
        for(int i = 0; i < H; i++) {
            System.out.println(board[i]);
        }
    }


}