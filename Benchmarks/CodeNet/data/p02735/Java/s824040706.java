import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            map[i] = scan.next().toCharArray();
        }
        int[][] dp = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = map[0][0] == '#' ? 1 : 0;
        for (int j = 0; j < W-1; j++) {
            dp[0][j+1] = dp[0][j] + (map[0][j] != map[0][j+1] && map[0][j+1] == '#' ? 1 : 0);
        }
        for (int i = 0; i < H - 1; i++) {
            dp[i+1][0] = dp[i][0] + (map[i][0] != map[i+1][0] && map[i+1][0] == '#' ? 1 : 0);
        }
        for (int i = 1; i < H; i++) {
            for (int j = 1; j < W; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + ((map[i-1][j] != map[i][j] && map[i][j] == '#') ? 1 : 0));
                dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + ((map[i][j-1] != map[i][j] && map[i][j] == '#') ? 1 : 0));
            }
        }
        System.out.println(dp[H-1][W-1]);
    }
    class UnionFind {
        int H;
        int W;
        int[] parent;
        int[] size;
        UnionFind(int H, int W) {
            this.H = H;
            this.W = W;
            int[] size = new int[H*W];
            Arrays.fill(size, 1);
            int[] parent = new int[H*W];
            for (int i = 0; i < H*W; i++) {
                parent[i] = i;
            }
            this.size = size;
            this.parent = parent;
        }
        int find(int r, int c) {
            return find(r * W + c);
        }
        int find(int key) {
            if (key == this.parent[key]) {
                return key;
            }
            return this.parent[key] = find(this.parent[key]);
        }
        boolean same(int r1, int c1, int r2, int c2) {
            return find(r1, c1) == find(r2, c2);
        }
        void unite(int r1, int c1, int r2, int c2) {
            int parent1 = find(r1, c1);
            int parent2 = find(r2, c2);
            if (parent1 == parent2) {
                return;
            }
            int size1 = this.size[parent1];
            int size2 = this.size[parent2];
            if (size1 < size2) {
                this.size[parent2] += this.size[parent1];
                this.size[parent1] = 0;
                this.parent[parent1] = parent2;
                return;
            }
            this.size[parent1] += this.size[parent2];
            this.size[parent2] = 0;
            this.parent[parent2] = parent1;
        }
    }
}
