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
        int K = scan.nextInt();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            map[i] = scan.next().toCharArray();
        }
        long max = pow(2, H - 1);
        int ans = Integer.MAX_VALUE;
        for (int bit = 0; bit < max; bit++) {
            ans = Math.min(ans, child(H, W, K, map, bit));
        }
        System.out.println(ans);
    }

    int child(int H, int W, int K, char[][] map, int bit) {
        List<Range> ranges = ranges(H, bit);
        int[] whites = new int[ranges.size()];
        int ranges_len = ranges.size();
        int cut = ranges_len-1;
        int previous_block_total = 0;
        int block_total = 0;
        for (int j = 0; j < W; j++) {
            for (int i = 0; i < H; i++) {
                if (map[i][j] == '0') {
                    continue;
                }
                for (int k = 0; k < ranges_len; k++) {
                    Range x = ranges.get(k);
                    if (x.from <= i && i <= x.to) {
                        whites[k] += 1;
                        block_total += 1;
                    }
                }
            }
            boolean overK = false;
            for (int k = 0; k < ranges_len; k++) {
                if (K < whites[k]) {
                    overK = true;
                    continue;
                }
            }
            if (overK) {
                j -= 1;
                Arrays.fill(whites, 0);
                cut += 1;
                block_total = 0;
                if (previous_block_total == 0) {
                    return Integer.MAX_VALUE;
                }
            }
            previous_block_total = block_total;
        }
        return cut;
    }
    List<Range> ranges(int H, int x) {
        int previous = 0;
        List<Range> range = new ArrayList<>();
        int base = 1;
        for (int i = 0; i < H-1; i++) {
            if (0 < (base & x)) {
                Range r = new Range(previous, i);
                range.add(r);
                previous = i + 1;
            }
            base *= 2;
        }
        Range r = new Range(previous, H-1);
        range.add(r);
        return range;

    }

    long pow(int base, int x) {
        if (x == 0) {
            return 1L;
        }
        if (x % 2 == 1) {
            return (long) base * pow(base, x - 1);
        }
        long t = pow(base, x / 2);
        return t * t;
    }

    class Range {
        int from;
        int to;
        Range(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
