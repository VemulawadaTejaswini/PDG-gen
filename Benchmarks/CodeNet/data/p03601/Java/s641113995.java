import java.util.*;

public class Main {
    static long MOD = 1000000007;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int[][] pars = new int[][]{{100 * a, 0}, {100 * b, 0}, {c, c}, {d, d}};

        double limit = 1.0 * e / (100 + e);

        Map<Integer, Integer> checked = new HashMap<>();
        Map<Integer, Integer> unchecked = new HashMap<>();

        unchecked.put(100 * a, 0);
        unchecked.put(100 * b, 0);

        while(unchecked.size() > 0) {
            Map<Integer, Integer> newUnchecked = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry: unchecked.entrySet()) {
                int w = entry.getKey();
                int s = entry.getValue();

                if(checked.getOrDefault(w, 0) <= s) {
                    checked.put(w, s);
                }

                for(int[] par: pars) {
                    int newW = w + par[0];
                    int newS = s + par[1];
                    double percent = 1.0 * newS / newW;

                    if(newW <= f && percent <= limit) {
                        if(newUnchecked.getOrDefault(newW, 0) <= newS) {
                            newUnchecked.put(newW, newS);
                        }
                    }
                }
            }
            unchecked = newUnchecked;
        }

        int ansW = f;
        int ansS = 0;
        double ansPercent = 0;

        for(Map.Entry<Integer, Integer> entry: checked.entrySet()) {
            int w = entry.getKey();
            int s = entry.getValue();
            double percent = 1.0 * s / w;

            if(percent > ansPercent) {
                ansW = w;
                ansS = s;
                ansPercent = percent;
            }
        }

        System.out.println(ansW + " " + ansS);
    }
}