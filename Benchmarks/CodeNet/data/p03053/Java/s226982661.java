import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        HashSet<String> checked = new HashSet<>();
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] sum = new int[H+2][W+2];
        for (int i = 0; i < H+2; i++) {
            Arrays.fill(sum[i], Integer.MAX_VALUE);
        }
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < H; i++) {
            String line = scan.next();
            char[] data = line.toCharArray();
            for (int j = 0; j < W; j++) {
                if (data[j] == '#') {
                    sum[i+1][j+1] = 1;
                    queue.add(new Pair(i+1, j+1));
                }
            }
        }
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (checked.contains(p.toString())) {
                continue;
            }
            sum[p.y-1][p.x] = Math.min(sum[p.y][p.x] + 1,sum[p.y-1][p.x]);
            sum[p.y+1][p.x] = Math.min(sum[p.y][p.x] + 1,sum[p.y+1][p.x]);
            sum[p.y][p.x-1] = Math.min(sum[p.y][p.x] + 1,sum[p.y][p.x-1]);
            sum[p.y][p.x+1] = Math.min(sum[p.y][p.x] + 1,sum[p.y][p.x+1]);
            checked.add(p.toString());
            if (p.y-1 != 0) {
                queue.add(new Pair(p.y-1,p.x));
            }
            if (H + 1 != p.y + 1) {
                queue.add(new Pair(p.y+1,p.x));
            }
            if (p.x - 1 != 0) {
                queue.add(new Pair(p.y,p.x - 1));
            }
            if (W + 1 != p.x + 1) {
                queue.add(new Pair(p.y,p.x + 1));
            }
        }
        int answer = 0;
        for(int i = 1; i <= H; i++) {
            for(int j = 1; j <= W; j++) {
               answer = Math.max(answer, sum[i][j]);
            }
        }
        System.out.println(answer-1);
    }
    class Pair {
        int y;
        int x;
        Pair(int y, int x) {
            this.x = x;
            this.y = y;
        }
        public String toString() {
            return x + ":" + y;
        }
    }
}
