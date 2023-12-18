import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 32 * 1024 * 1024).start(); // 16MBスタックを確保して実行
    }

    public void run() {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String[] str = br.readLine().split(" ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] h = new int[n];
        boolean[] node = new boolean[n];
        Arrays.fill(node, true);
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }
        int result = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < m; i++) {
            x = Integer.parseInt(sc.next()) - 1;
            y = Integer.parseInt(sc.next()) - 1;
            if (h[x] < h[y]) {
                node[x] = false;
            } else if (h[x] > h[y]) {
                node[y] = false;
            } else {
                node[x] = false;
                node[y] = false;
            }
        }
        sc.close();
        for (boolean s : node) {
            if (s) {
                result++;
            }
        }
        System.out.println(result);
    }
}
