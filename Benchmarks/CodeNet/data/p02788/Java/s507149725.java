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

        long ans = 0;
        while (!m.isEmpty()) {
            Integer from = m.firstKey();
            Integer to = from + 2 * D;
            Integer v = m.firstEntry().getValue();
            Integer cnt = v / A + (v % A == 0 ? 0 : 1);
            ans += cnt;
            List<Integer> addBuf = new ArrayList<>();
            List<Integer> delBuf = new ArrayList<>();
            for (Map.Entry<Integer, Integer> e: m.subMap(from, to + 1).entrySet()) {
                Integer key = e.getKey();
                Integer value = e.getValue() - A * cnt;
                if (value > 0) {
                    addBuf.add(key);
                } else {
                    delBuf.add(key);
                }
            }
            for(Integer key: addBuf) {
                m.put(key, m.get(key) - A * cnt);
            }
            for(Integer key: delBuf) {
                m.remove(key);
            }
        }

        System.out.println(ans);
    }
}
