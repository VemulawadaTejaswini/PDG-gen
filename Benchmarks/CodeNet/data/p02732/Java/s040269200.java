import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readInt(sc);
        int[] list = new int[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = readInt(sc);
            list[i] = tmp;
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp, 1);
            }
        }

        Map<Integer, Integer> memo = new HashMap<>();
        Map<Integer, Integer> ansMemo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int k = list[i];
            if(ansMemo.containsKey(k)){
                System.out.println(ansMemo.get(k));
                continue;
            }
            Map<Integer, Integer> m = new HashMap<Integer, Integer>(map);
            m.put(k, map.get(k) - 1);
            int ans = 0;
            for (int val : m.values()) {
                if (memo.containsKey(val)) {
                    ans += memo.get(val);
                    continue;
                }
                int cal = val * (val - 1) / 2;
                ans += cal;
                memo.put(val, cal);
            }
            System.out.println(ans);
            ansMemo.put(k, ans);
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