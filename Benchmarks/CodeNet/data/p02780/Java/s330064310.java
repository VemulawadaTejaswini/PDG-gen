import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private double expect(int k) {
        return (0.5) * (k - 1) + 1.0;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        int[] pa = new int[N + 1];
        
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i + 1 <= N; i++) {
            pa[i + 1] = pa[i] + p[i];
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i + K <= N; i++) {
            int diff = pa[K + i] - pa[i];
            //System.out.println(i + "," + diff);
            if (max < diff) {
                max = diff;
                idx = i;
            }
        }

        double score = 0.0;
        for (int i = idx; i < idx + K; i++) {
            score += expect(p[i]);
        }

        //System.out.println(idx + "," + score);
        System.out.println(score);
        return;
    }

}