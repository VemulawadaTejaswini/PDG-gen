import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    private int[] size;
    private int[] parent;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        this.size= new int[N];
        this.parent = new int[N];
        for (int i = 0; i < N; i++) {
            this.size[i] = 1;
            this.parent[i] = i;
        }
        for (int i = 0; i < N-1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            int w = scan.nextInt();
            if (w % 2 == 0) {
                unite(u-1, v-1);
            }
        }
        int white_node = this.find(0);
        System.out.println("0");
        for (int i = 1; i < N; i++) {
            if (white_node == this.find(i)) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
    int find(int x) {
        if (this.parent[x] == x) {
            return x;
        }
        return this.parent[x] = find(this.parent[x]);
    }
    void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return;
        }
        if (size[x] < size[y]) {
            parent[x] = y;
            size[y] += size[x];
            size[x] = -1;
        } else {
            parent[y] = x;
            size[x] += size[y];
            size[y] = -1;
        }
    }
    int size(int x) {
        x = find(x);
        return size[x];
    }
    boolean same(int x, int y) {
        return find(x) == find(y);
    }

}
