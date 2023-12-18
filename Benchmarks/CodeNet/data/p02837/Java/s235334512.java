import java.util.*;

public class Main {

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Count number of 1's
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Pair>> li = new ArrayList<>();
        for (int i = 0; i < n; ++i) li.add(new ArrayList<>());
        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            for (int j = 0; j < a; ++j) {
                li.get(i).add(new Pair(sc.nextInt() - 1, sc.nextInt()));
            }
        }

        int res = 0;
        for (int bit = 0; bit < (1<<n); ++bit) {
            boolean flag = true;
            for (int i = 0; i < n; ++i) {
                if ((bit & (1<<i)) == 0) continue;

                for (Pair p : li.get(i)) {
                    if (p.y == 1 && (bit & (1<<p.x)) == 0) flag = false;
                    if (p.y == 0 && (bit & (1<<p.x)) != 0) flag = false;
                }
            }
            if (flag) {
                res = Math.max(res, countSetBits(bit));
            }
        }

        System.out.println(res);
    }
}