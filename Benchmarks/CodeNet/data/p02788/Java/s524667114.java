import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int D = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            Integer x = Integer.parseInt(scanner.next());
            Integer h = Integer.parseInt(scanner.next());
            m.put(x, h);
        }

        TreeMap<Integer, Integer> bomb = new TreeMap<>();

        long ans = 0;
        while (!m.isEmpty()) {
            Integer at = m.firstKey();
            Integer v = m.firstEntry().getValue();
            Integer prev = 0;
            for (Integer val: bomb.subMap(at - D, at + D + 1).values()) {
                prev += val;
            }
            v -= A * prev;
            if (v <= 0) {
                m.remove(at);
                continue;
            }
            Integer cnt = v / A + (v % A == 0 ? 0 : 1);
            ans += cnt;
            bomb.put(at + D, cnt);
            m.remove(at);
        }

        System.out.println(ans);
    }
}

class LazySegTree {

    private int size;
    public int[] nodes;
    public int[] lazy;

    // RSQ
    public LazySegTree(int size) {
        this.size = Integer.highestOneBit(size);
        if (size > this.size) {
            this.size <<= 1;
        }
        nodes = new int[this.size * 2];
        lazy = new int[this.size * 2];
    }

    public void add(int index, int x) {
        add(index, index + 1, x);
    }

    public void add(int fromInc, int toExc, int x) {
        add(fromInc, toExc, x, 0, 0, size);
    }

    private void add(int fromInc, int toExc, int x, int index, int leftInc, int rightExc) {
        if (fromInc <= leftInc && rightExc <= toExc) {
            nodes[index] += x;
        } else if (leftInc < toExc && fromInc < rightExc) {
            lazy[index] += (Math.min(toExc, rightExc) - Math.max(fromInc, leftInc)) * x;
            add(fromInc, toExc, x, index * 2 + 1, leftInc, (leftInc + rightExc) >>> 1);
            add(fromInc, toExc, x, index * 2 + 2, (leftInc + rightExc) >>> 1, rightExc);
        }
    }

    public int sum(int fromInc, int toExc) {
        return sum(fromInc, toExc, 0, 0, size);
    }

    private int sum(int fromInc, int toExc, int index, int leftInc, int rightExc) {
        if (rightExc <= fromInc || toExc <= leftInc) {
            return 0;
        }

        if (fromInc <= leftInc && rightExc <= toExc) {
            return nodes[index] * (rightExc - leftInc) + lazy[index];
        }

        int res = (Math.min(toExc, rightExc) - Math.max(fromInc, leftInc)) * nodes[index];
        int l = sum(fromInc, toExc, index * 2 + 1, leftInc, (leftInc + rightExc) >>> 1);
        int r = sum(fromInc, toExc, index * 2 + 2, (leftInc + rightExc) >>> 1, rightExc);
        return res + l + r;
    }
}

