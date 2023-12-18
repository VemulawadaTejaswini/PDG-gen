import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();

    char[][] arr = new char[h][w];

    int[] dx = {1, 0};
    int[] dy = {0, 1};

    List<Integer> list = new ArrayList<>();

    int ans = Integer.MAX_VALUE;


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        for (int i=0; i<h; i++) {
            arr[i] = sc.next().toCharArray();
        }



        dfs(0, 0, 0);

        PrintWriter out = new PrintWriter(System.out);
        if (arr[0][0]=='#') {
            out.print(ans+1);
        } else {
            out.print(ans);
        }
//        out.print(list);
        out.flush();

    }

    int dfs(int y, int x, int cnt) {
        if (y==h-1 && x==w-1) {
            ans = Math.min(ans, cnt);
        }
        char c = arr[y][x];
        if (ans!=Integer.MAX_VALUE && ans<cnt) return Integer.MAX_VALUE;
        if (c=='.') {
            for (int i=0; i<2; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < w && 0 <= ny && ny < h) {
                    if (arr[ny][nx] == '.') {
                        dfs(ny, nx, cnt);
                    } else {
                        dfs(ny, nx, cnt + 1);
                    }
                }
            }
        } else {
            for (int i=0; i<2; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];


                if (0 <= nx && nx < w && 0 <= ny && ny < h) {
                    if (arr[ny][nx] == '.') {
                        dfs(ny, nx, cnt);
                    } else {
                        dfs(ny, nx, cnt);
                    }
                }
            }
        }
        return ans;
    }
}