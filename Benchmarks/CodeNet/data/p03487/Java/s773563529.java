import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Map<Long, Long> m = new HashMap<>();

        for (int n = 0; n < N; n++) {
            Long a = in.nextLong();

            if (m.containsKey(a)) {
                m.put(a, m.get(a) + 1);
            } else {
                m.put(a, 1L);
            }
        }

        long res = 0;
        for (long k : m.keySet()) {
            long v = m.get(k);

            if (k > v) {
                res += v;
            } else {
                res += v - k;
            }
        }

        System.out.println(res);
    }
}
