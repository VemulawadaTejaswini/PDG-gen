import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
        Node start = new Node(0, 0);
        UnionFind union = new UnionFind(H, W);
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.row + 1 < H) {
                if (map[node.row][node.column] == map[node.row+1][node.column]) {
                    union.unite(node.row, node.column, node.row+1, node.column);
                }
                Node n = new Node(node.row+1, node.column);
                queue.add(n);
            }
            if (node.column + 1 < W) {
                if (map[node.row][node.column] == map[node.row][node.column+1]) {
                    union.unite(node.row, node.column, node.row, node.column+1);
                }
                Node n = new Node(node.row, node.column+1);
                queue.add(n);
            }
        }
        int[][][] dp = new int[H][W][2];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp[i][j][0] = Integer.MAX_VALUE;
                dp[i][j][1] = union.find(i, j);
            }
        }
        dp[0][0][0] = map[0][0] == '#' ? 1 : 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '#') {
                    if (j + 1 < W) {
                        dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], dp[i][j][0]);
                        if (0 <= i - 1) {
                            if (dp[i][j + 1][1] != dp[i - 1][j + 1][1] && map[i][j + 1] == '#') {
                                dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], dp[i - 1][j + 1][0] + 1);
                            } else {
                                dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], dp[i - 1][j + 1][0]);
                            }
                        }
                    }
                    if (i + 1 < H) {
                        dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], dp[i][j][0]);
                        if (0 <= j - 1) {
                            if (dp[i + 1][j][1] != dp[i + 1][j - 1][1] && map[i + 1][j] == '#') {
                                dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], dp[i + 1][j - 1][0] + 1);
                            } else {
                                dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], dp[i + 1][j - 1][0]);
                            }
                        }
                    }
                    continue;
                }
                if (map[i][j] == '.') {
                    if (j + 1 < W) {
                        if (dp[i][j][1] == dp[i][j+1][1]) {
                            dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], dp[i][j][0]);
                        } else {
                            dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], dp[i][j][0] + 1);
                        }
                        if (0 <= i - 1) {
                            if (dp[i][j + 1][1] == dp[i - 1][j + 1][1]) {
                                dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], dp[i - 1][j + 1][0]);
                            } else {
                                dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], dp[i - 1][j + 1][0] + 1);
                            }
                        }
                    }
                    if (i + 1 < H) {
                        if (dp[i][j][1] == dp[i + 1][j][1]) {
                            dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], dp[i][j][0]);
                        } else {
                            dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], dp[i][j][0] + 1);
                        }
                        if (0 <= j - 1) {
                            if (dp[i + 1][j][1] == dp[i + 1][j - 1][1]) {
                                dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], dp[i + 1][j - 1][0]);
                            } else {
                                dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], dp[i + 1][j - 1][0] + 1);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[H-1][W-1][0]);
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
    class Node {
        int row;
        int column;
        Node(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
}
