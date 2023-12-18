import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[N];
        int[] c = new int[N];

        Map<Integer, Integer> rules = new HashMap<>();
        for (int i = 0; i < M; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            //System.out.println(String.format("input: (%d, %d)", s[i], c[i]));
            if (rules.containsKey(s[i])) {
                int v = rules.get(s[i]);
                if (v == c[i]) {
                    // ok
                } else {
                    System.out.println("-1");
                    return;
                }
            } else {
                rules.put(s[i], c[i]);
            }
        }

        int ans = 0;
        for (Map.Entry e : rules.entrySet()) {
            int dig = (Integer)e.getKey();
            int val = (Integer)e.getValue();
            //System.out.println(String.format("(%d, %d)", val, dig));

            if (dig == N && N >= 2) {
                if (val >= 1 && val <= 9) {
                    ans += val * Math.pow(10, N - dig);
                } else {
                    ans = -1;
                    break;
                }
            } else  {
                ans += val * Math.pow(10, N - dig);
            }
        }

        System.out.println(ans);
        return;
    }

}