import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        long[] fx = new long[n];
        long[] fy = new long[n];
        for (int i = 0; i < n; i++) {
            long x = nextLong(scanner);
            long y = nextLong(scanner);
            fx[i] = x - y;
            fy[i] = x + y;
        }
        long fxMax = Arrays.stream(fx).max().orElse(0);
        long fxMin = Arrays.stream(fx).min().orElse(0);
        long fyMax = Arrays.stream(fy).max().orElse(0);
        long fyMin = Arrays.stream(fy).min().orElse(0);
        System.out.println(Math.max(fxMax - fxMin, fyMax - fyMin));
    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}


class UnionFind {
    int[] parent;

    UnionFind(int n) {
        parent = new int[n];
        Arrays.fill(parent, -1);
    }

    int find(int x) {
        if (parent[x] < 0) {
            return x;
        } else {
            parent[x] = find(parent[x]);
            return parent[x];
        }
    }

    void unite(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) {
            return;
        }

        if (parent[rootX] > parent[rootY]) {
            int temp = rootX;
            rootX = rootY;
            rootY = temp;
        }
        parent[rootX] += parent[rootY];
        parent[rootY] = rootX;
    }

}
