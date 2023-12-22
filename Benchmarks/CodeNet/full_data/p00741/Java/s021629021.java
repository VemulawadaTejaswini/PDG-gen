import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Board> bs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }


    private void read() {
        bs = new ArrayList<>();
        String[] elems;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                elems = br.readLine().split(" ");
                if (elems[0].equals("0") && elems[1].equals("0"))
                    return;
                Board b = new Board(Integer.parseInt(elems[0]), Integer.parseInt(elems[1]));
                for (int i = 0; i < b.h; i++) {
                    elems = br.readLine().split(" ");
                    for (int j = 0; j < b.w; j++) {
                        b.board[i][j] = elems[j].equals("1");
                    }
                }
                bs.add(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        for (Board b: bs) {
            boolean[][] used = new boolean[b.h][b.w];
            int ans = 0;
            for (int i = 0; i < b.h; i++) {
                for (int j = 0; j < b.w; j++) {
                    if (b.board[i][j] && !used[i][j]) {
                        dfs(b, j, i, used);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    private void dfs(Board b, int x, int y, boolean[][] used) {
        if (used[y][x])
            return;
        used[y][x] = true;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int _x = x + dx;
                int _y = y + dy;
                if (0 <= _x && _x < b.w &&
                        0 <= _y && _y < b.h &&
                        !used[_y][_x] && b.board[_y][_x])
                    dfs(b, _x, _y, used);
            }
        }
    }

    private class Board {
        int w, h;
        boolean[][] board;
        Board(int w, int h) {
            this.w = w;
            this.h = h;
            board = new boolean[h][w];
        }
    }

}