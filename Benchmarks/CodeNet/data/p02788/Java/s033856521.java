import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long D = sc.nextLong();
            long A = sc.nextLong();

            Monster[] M = new Monster[N];
            for (int i = 0; i < N; i++) {
                M[i] = new Monster();
                M[i].X = sc.nextLong();
                M[i].H = sc.nextLong();
            }

            Arrays.sort(M, new Comparator<Monster>() {
                @Override
                public int compare(Monster o1, Monster o2) {
                    return Long.compare(o1.X, o2.X);
                }
            });

            long ans = 0;

            int s = 0;
            while (s < N) {
                long k = (M[s].H + A - 1) / A;
                ans += k;

                for (int i = s + 1; i < N; i++) {
                    if (M[i].X > M[s].X + D * 2) {
                        break;
                    }

                    M[i].H -= A * k;
                }

                int t = N;
                for (int i = s + 1; i < N; i++) {
                    if (M[i].H > 0) {
                        t = i;
                        break;
                    }
                }

                s = t;
            }

            System.out.println(ans);
        }
    }

    static class Monster {

        long X;

        long H;

    }

}
