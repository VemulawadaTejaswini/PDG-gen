
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) P[i] = sc.nextInt();

        int[] sortedFrom = new int[N];
        int sol = 0;

        for (int i = 1; i < N; i++) {
            sortedFrom[i] = P[i] >= P[i - 1] ? sortedFrom[i - 1] : i;
            if (i - sortedFrom[i] >= K - 1) sol = 1;
        }

        SortedSet<Integer> window = new TreeSet<>();
        for (int i = 0; i < K; i++) window.add(P[i]);

        for (int i = 0; i + K - 1 < N; i++) {
            if (i > 0) {
                window.remove(P[i - 1]);
                window.add(P[i + K - 1]);
            }
            if (sortedFrom[i + K - 1] <= i) continue;
            if (i + K == N) {
                sol++;
                break;
            }
            if (P[i] != window.first() || P[i + K] < window.last()) sol++;
        }
        System.out.println(sol);
    }
}
