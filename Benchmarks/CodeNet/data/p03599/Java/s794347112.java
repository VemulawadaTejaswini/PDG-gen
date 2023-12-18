import java.util.*;

public class Main {

    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        E = sc.nextInt();
        F = sc.nextInt();
        System.out.println(solve());
    }

    private static String solve() {
        Result max = null;
        for (int water : availableWaters()) {
            int sugar = calcAvailableSugar(water);
            Result r = new Result(water, sugar);

            if( max == null || r.noudo() > max.noudo()) {
                max = r;
            }
        }
        return (max.water + max.sugar) + " " + max.sugar;
    }

    private static int calcAvailableSugar(int water) {
        // waterは100単位のはず
        int maxSugar = Math.min(F - water, water / 100 * E);

        int cm = maxSugar/C;
        int dm = maxSugar/D;
        int max = 0;
        for (int c = 0; c <= cm; c++) {
            for (int d = 0; d <= dm; d++) {
                int sugar = c*C + d*D;
                if( sugar <= maxSugar ) {
                    max = Math.max(max, sugar);
                }
            }
        }
        return max;
    }

    private static class Result {
        private final int water;
        private final int sugar;

        public Result(int water, int sugar) {
            this.water = water;
            this.sugar = sugar;
        }

        private double noudo() {
            return (double)sugar * 100 / (water + sugar);
        }
    }

    private static List<Integer> availableWaters() {
        Set<Integer> set = new HashSet<>();
        int am = F/(A*100);
        int bm = F/(B*100);
        for (int a = 0; a <= am; a++) {
            for (int b = 0; b <= bm; b++) {

                int water = a*A*100 + b*B*100;
                if( water < F ) {
                    set.add(water);
                }
            }
        }
        set.remove(0);

        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());
        return list;
    }
}
