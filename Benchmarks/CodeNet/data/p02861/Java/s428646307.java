import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private void genPermutation(List<List<Integer>> perm, List<Integer> cand, List<Integer> cur) {
        if (cand.size() == 0) {
            perm.add(cur);
            return;
        } else {
            for (int i = 0; i < cand.size(); i++) {
                List<Integer> nc = new ArrayList<Integer>(cand);
                List<Integer> cc = new ArrayList<Integer>(cur);

                int v = nc.remove(i);
                cc.add(v);
                genPermutation(perm, nc, cc);
            }
        }
    }

    private long calc(long N) {
        if (N == 1) return 1;
        else return N*calc(N - 1);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        List<Integer> cand = new ArrayList<Integer>();
        for (int i = 1; i <= N; i++) {
            cand.add(i);
        }

        List<List<Integer>> perm = new ArrayList<List<Integer>>();
        genPermutation(perm, cand, new ArrayList<Integer>());

        double sum = 0;
        for (List<Integer> list : perm) {

            for (int i = 0; i < N - 1; i++) {
                int src = list.get(i) - 1;
                int dst = list.get(i + 1) - 1;

                long v1 = x[dst] - x[src];
                long v2 = y[dst] - y[src];

                sum += Math.sqrt(v1 * v1 + v2 * v2);
            }

        }

        long pe = calc(N);

        System.out.println(sum/pe);

        return;
    }

}