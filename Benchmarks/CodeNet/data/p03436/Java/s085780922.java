import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] move = {{-1,0},{0,-1},{1,0},{0,1}};
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = scan.next();
            char[] d = s.toCharArray();
            map[i] = d;
        }
        int white_count = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '.') {
                    white_count += 1;
                }
            }
        }
        int[][] dp = new int[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 1;
        Deque<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[H][W];
        Node start = new Node(0,0);
        queue.add(start);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            visited[current.i][current.j] = true;
            for (int i = 0; i < 4; i++) {
                int next_i = current.i + move[i][0];
                int next_j = current.j + move[i][1];
                if (next_i < 0 || H - 1 < next_i) {
                    continue;
                }
                if (next_j < 0 || W - 1 < next_j) {
                    continue;
                }
                if (map[next_i][next_j] == '#') {
                    continue;
                }
                if (visited[next_i][next_j]) {
                    continue;
                }
                dp[next_i][next_j] = Math.min(dp[next_i][next_j], dp[current.i][current.j]+1);
                queue.add(new Node(next_i, next_j));
            }
        }
        if (dp[H-1][W-1] == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }
        System.out.println(white_count - dp[H-1][W-1]);
    }
    class Node {
        int i;
        int j;
        Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
