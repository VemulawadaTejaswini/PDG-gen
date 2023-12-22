import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    StringTokenizer st;

    int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine(), " ");
        }
        return Integer.parseInt(st.nextToken());
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    int W, H;
//    int[][] arr = new int[105][105];
    boolean[][] vis = new boolean[105][105];
    char[][] arr = new char[105][105];
    void solve() throws IOException {
        while (true) {
            H = readInt();
            W = readInt();
            if (W == 0 && H == 0) {
                break;
            }
            vis = new boolean[105][105];
            arr = new char[105][105];
            for (int i = 0; i < H; i++) {
                arr[i] = readLine().toCharArray();
            }

            int sum = 0;
            for(int i = 0; i< H;i++)
            {
                for(int j = 0; j< W;j++)
                {
                    if (!vis[i][j])
                    {
                        dist(i,j,arr[i][j]);
                        sum++;
                    }
                }
            }
            out.println(sum);
        }
        out.flush();
    }

//    int[] dx = {1, -1, 0, 0};
//    int[] dy = {0, 0, 1, -1};
//    private void dfs(int x, int y, char c) {
//        arr[x][y] = '.';
//        for (int i = 0; i < 4; i++) {
//            int nx = x + dx[i], ny = y + dy[i];
//            if (nx > 0 && nx <= H && ny > 0 && ny <= W && arr[nx][ny] == c) {
//                dfs(nx, ny, c);
//            }
//        }
//
//    }

    int dx[]={ 0, 0, -1,1};
    int dy[]={ -1, 1, 0, 0};

    void dfs(int x,int y,char c)
    {
        vis[x][y] = true;
        for(int i = 0;i<4;i++)
        {
            int nx = x+dx[i], ny = y+dy[i];
            if(nx>=0 && nx<H && ny>=0 && ny<W  && vis[nx][ny] == false && arr[nx][ny] == c){

                dfs(nx,ny,c);
            }
        }
    }

    void dist(int x, int y, char c) {
        try {
            if (!vis[x][y] && arr[x][y] == c) {
                vis[x][y] = true; // 分配済みフラグを立てる
                for(int i = 0;i<4;i++)
                {
                    int nx = x+dx[i], ny = y+dy[i];
//                    if(nx>=0 && nx<H && ny>=0 && ny<W){
//
//                        dist(nx,ny,c);
//                    }
                    dist(nx, ny, c);
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
    }


}
