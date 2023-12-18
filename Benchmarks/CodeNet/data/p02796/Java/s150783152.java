import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] X = new long[N];
            long[] L = new long[N];
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextLong();
                L[i] = sc.nextLong();
            }

            List<Robo> robos = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                robos.add(new Robo(i, X[i] - L[i], X[i] + L[i]));
            }

            Collections.sort(robos, new Comparator<Robo>() {
                @Override
                public int compare(Robo o1, Robo o2) {
                    int comp = Long.compare(o1.right, o2.right);
                    if (comp == 0) {
                        comp = Long.compare(o1.left, o2.left);
                    }
                    return comp;
                }
            });

            int ans = 0;
            long right = Long.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                Robo robo = robos.get(i);

                if (robo.left < right) {
                    continue;
                }

                right = robo.right;
                ans++;
            }

            System.out.println(ans);
        }
    }

    static class Robo {

        int index;

        long left;

        long right;

        public Robo(int index, long left, long right) {
            this.index = index;
            this.left = left;
            this.right = right;
        }

    }

}
