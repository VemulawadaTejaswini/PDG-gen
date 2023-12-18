import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    int INF = 100000000;
    char maze[][] = new char[5000][5001];
    int R, C;
    int sx, sy;
    int gx, gy;
    int d[][] = new int[5000][5001];
    int dx[] = {1, 0, -1, 0};
    int dy[] = {0, 1, 0, -1};
    boolean ch=true;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sx = 0;
        sy = 0;
        gx = R-1;
        gy = C-1;
        int black=0;
        String a[] = new String[R];
        for (int i = 0; i < R; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < R; i++) {
            maze[i] = a[i].toCharArray();
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(maze[i][j]=='#')black++;
                d[i][j] = INF;
            }
        }
        int ans = bfs();
        int A=R*C-ans-black-1;
        if(ch==true){
            System.out.println(A);
        }else{
            System.out.println("-1");
        }
    }

    int bfs() {
        Queue<Pair> queue = new ArrayDeque<Pair>();
        queue.add(new Pair(sx, sy));
        d[sx][sy] = 0;
        while (queue.size() >= 1) {
            Pair p = queue.poll();
            if (p.x == gx && p.y == gy) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i], ny = p.y + dy[i];
                if (0 <= nx && nx < R && 0 <= ny && ny < C && maze[nx][ny] != '#' && d[nx][ny] == INF) {
                    queue.add(new Pair(nx, ny));
                    d[nx][ny] = d[p.x][p.y] + 1;
                }
            }
        }
        if(d[gx][gy]==INF){
            ch=false;
        }
        return d[gx][gy];
    }

    class Pair {

        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}