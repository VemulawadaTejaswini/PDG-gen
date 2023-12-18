import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Integer n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Queue<Integer> rs = new ArrayDeque<>();
        Queue<Integer> gs = new ArrayDeque<>();
        Queue<Integer> bs = new ArrayDeque<>();

        Map<Integer, Base> colorMap = new HashMap<>();

        int i = 1;
        for (char c : str.toCharArray()) {
            if (c == 'R') {
                rs.add(i);
                colorMap.put(i, new Base(rs, gs, bs));
            } else if (c == 'G') {
                gs.add(i);
                colorMap.put(i, new Base(gs, bs, rs));
            } else {
                bs.add(i);
                colorMap.put(i, new Base(bs, rs, gs));
            }
            i++;
        }

//        System.out.println(rs + ": " + rs.size());
//        System.out.println(gs + ": " + gs.size());
//        System.out.println(bs + ": " + bs.size());

        Set<Tri> set = new HashSet<>();
        long total = 0;
        long minus = 0;
        for (Integer first : rs) { //1000
            minus = getMinus(n, rs, gs, (Map<Integer, Base>) colorMap, (Set<Tri>) set, minus, first); // 1000
            minus = getMinus(n, rs, bs, (Map<Integer, Base>) colorMap, (Set<Tri>) set, minus, first);
        }
        total = rs.size() * bs.size() * gs.size();
//        System.out.println(total);
        System.out.println(total - minus);
//        System.out.println(set);
    }

    private static long getMinus(Integer n, Queue<Integer> rs, Queue<Integer> gs, Map<Integer, Base> colorMap, Set<Tri> set, long minus, Integer first) {
        for (Integer an1 : gs) {
            int sub = an1 - first; // 5 - 1 = 4

            int pos = an1 + sub; // 5 + 4 = 9
            int neg = first - sub; // 1 - 4 = -3

            if (1 <= pos && pos <= n) {
                Base posi = colorMap.get(pos); // 9を探す
                if (posi.base.equals(rs) || posi.base.equals(gs)) { // 9が同じ色
                    continue;
                }
//                System.out.print(first + ":");
//                System.out.print(an1 + ":");
//                System.out.print(pos);
                if (set.add(new Tri(first, an1, pos))) {
                    minus++;
//                    System.out.println(" is first occurred." + minus);
                } else {
//                    System.out.println(" is duplicated.");
                }
            }
            if (1 <= neg && neg <= n) {
                Base nega = colorMap.get(neg); // -3を探す
                if (nega.base.equals(rs) || nega.base.equals(gs)) { // -3が同じ色
                    continue;
                }
//                System.out.print(first + ":");
//                System.out.print(an1 + ":");
//                System.out.print(neg);
                if (set.add(new Tri(first, an1, neg))) {
                    minus++;
//                    System.out.println(" is first occurred." + minus);
                } else {
//                    System.out.println(" is duplicated.");
                }
            }
        }
        return minus;
    }

    static class Base {
        Queue<Integer> base;
        Queue<Integer> another1;
        Queue<Integer> another2;

        public Base(Queue<Integer> base, Queue<Integer> another1, Queue<Integer> another2) {
            this.base = base;
            this.another1 = another1;
            this.another2 = another2;
        }
    }

    static class Tri {
        int a, b, c;

        public Tri(int a, int b, int c) {
            int[] is = new int[3];
            is[0] = a;
            is[1] = b;
            is[2] = c;
            Arrays.sort(is);

            this.a = is[0];
            this.b = is[1];
            this.c = is[2];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tri tri = (Tri) o;
            return a == tri.a &&
                    b == tri.b &&
                    c == tri.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, c);
        }

        @Override
        public String toString() {
            return "Tri{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    '}';
        }
    }

}
