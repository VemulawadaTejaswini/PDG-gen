import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readInt(sc);
        int[] list = new int[n];
        int[] map = new int[n];
        int[] ansMemo = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = -1;
            map[i] = -1;
            ansMemo[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int tmp = readInt(sc);
            list[i] = tmp;
            if (map[i] != -1) {
                map[i]++;
            } else {
                map[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int k = list[i];
            if (ansMemo[k] != -1) {
                System.out.println(ansMemo[k]);
                continue;
            }
            int[] m = new int[n];
            int[] memo = new int[n];
            for (int j = 0; j < n; j++) {
                memo[j] = -1;
            }
            System.arraycopy(map, 0, m, 0, n);
            m[k] = map[k] - 1;
            int ans = 0;
            for (int val : m) {
                if (val == -1)
                    continue;
                for (int j = 0; j < n; j++) {
                    if (memo[val] != -1) {
                        ans += memo[val];
                        continue;
                    }
                    int cal = val * (val - 1) / 2;
                    ans += cal;
                    memo[val] = cal;
                }
                System.out.println(ans);
                ansMemo[k] = ans;
            }
        }

    }

    static int readInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
}

class Pair {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Pair() {

    }

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO ちゃんと書く

        return this.x == ((Pair) obj).getX() && y == ((Pair) obj).getY();
    }

}