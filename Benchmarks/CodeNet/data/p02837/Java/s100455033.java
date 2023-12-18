import java.util.*;

public class Main {

    static class Pair {
        int p, q;

        public Pair(int p, int q) {
            this.p = p;
            this.q = q;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Pair>> li = new ArrayList<>();
        for (int i = 0; i < N; ++i) li.add(new ArrayList<>());
        for (int i = 0; i < N; ++i) {
            int A = sc.nextInt();
            for (int j = 0; j < A; ++j) {
                li.get(i).add(new Pair(sc.nextInt() - 1, sc.nextInt()));
            }
        }

        int res = 0;
        for (int bit = 0; bit < (1<<N); ++bit) {
            boolean flag = true;
            for (int i = 0; i < N; ++i) {
                if ((bit & (1<<i)) == 0) continue;
                for (Pair p : li.get(i)) {
                    if (p.q == 1 && (bit & (1<<p.p)) == 0) flag = false;
                    if (p.q == 0 && (bit & (1<<p.p)) != 0) flag = false;
                }
            }
            if (flag) {
                int cnt = 0;
                for (int i = 0; i < N; ++i) {
                    if ((bit & (1<<i)) != 0) ++cnt;
                }
                res = Math.max(res, cnt);
            }
        }

        System.out.println(res);
    }
}