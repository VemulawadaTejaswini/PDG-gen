import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

// Javaなら通るかなと思って
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int Ch = sc.nextInt() - 1;
        int Cw = sc.nextInt() - 1;
        int Dh = sc.nextInt() - 1;
        int Dw = sc.nextInt() - 1;
        char[][] maze = new char[H][W];
        for(int i = 0; i < H; i++){
            String s = sc.next();
            for(int j = 0; j < W; j++)
                maze[i][j] = s.charAt(j);
        }
        sc.close();

        int[][] dist = new int[H][W];
        for(int i = 0; i < H; i++)
            Arrays.fill(dist[i], Integer.MAX_VALUE / 2);
        dist[Ch][Cw] = 0;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Deque<Integer> deque = new ArrayDeque<>(100000);
        deque.addLast(Ch);
        deque.addLast(Cw);
        int d = dist[Ch][Cw];
        while(deque.isEmpty() == false){
            int pi = deque.poll();
            int pj = deque.poll();
            d = dist[pi][pj];
            for(int i = 0; i < 4; i++){
                int ni = pi + dx[i];
                int nj = pj + dy[i];
                if(ni < 0 || ni >= H || nj < 0 || nj >= W) continue;
                if(maze[ni][nj] == '#') continue;
                if(dist[ni][nj] <= d) continue;
                dist[ni][nj] = d;
                deque.addFirst(nj);
                deque.addFirst(ni);
            }
            for(int i = -2; i <= 2; i++){
                for(int j = -2; j <= 2; j++){
                    int ni = pi + i;
                    int nj = pj + j;
                    if(ni < 0 || ni >= H || nj < 0 || nj >= W) continue;
                    if(maze[ni][nj] == '#') continue;
                    if(dist[ni][nj] <= d + 1) continue;
                    dist[ni][nj] = d + 1;
                    deque.addLast(ni);
                    deque.addLast(nj);
                }
            }
        }

        int ans = dist[Dh][Dw];
        if(ans == Integer.MAX_VALUE / 2) ans = -1;
        System.out.println(ans);
    }
}
