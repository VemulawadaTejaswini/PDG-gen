import java.util.*;

public class Main {

    private static List<List<Integer>> lists;

    public static class query {
        private int a;
        private int b;
        private int c;
        private int d;

        public query(int aa, int bb, int cc, int dd) {
            a = aa;
            b = bb;
            c = cc;
            d = dd;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public int getD() {
            return d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        lists = new ArrayList<>();
        getLists(N, M, 0, 0, new ArrayList<>());
        List<query> queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int aa = sc.nextInt();
            int bb = sc.nextInt();
            int cc = sc.nextInt();
            int dd = sc.nextInt();

            query q = new query(aa, bb, cc, dd);
            queries.add(q);
        }
        sc.close();

        long max = 0;

        for (List<Integer> li : lists) {
            long tmp = 0;
            for (query q : queries) {
                long val = li.get(q.getB() - 1) - li.get(q.getA() - 1);
                if (val == q.getC()) {
                    tmp += q.getD();
                }
            }
            if (tmp > max) {
                max = tmp;
            }
        }
        System.out.println(max);
    }

    public static void getLists(int N, int M, int count, int lastNum, List<Integer> listss) {
        if (count == N) {
            lists.add(new ArrayList<>(listss));
            return;
        }
        for (int i = 1; i <= M; i++) {
            if (lastNum > i) {
                continue;
            }
            listss.add(i);
            getLists(N, M, count + 1, i, listss);
            listss.remove(listss.size() - 1);
        }
    }
}
