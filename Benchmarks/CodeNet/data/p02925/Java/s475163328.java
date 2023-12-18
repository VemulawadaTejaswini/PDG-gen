import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] A = new int[N][N - 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                A[i][j] = sc.nextInt() - 1;
            }
        }

        List<Integer> candidates = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            candidates.add(i);
        }
        int[] current = new int[N];
        int days = 0;
        while (true) {
            boolean change = false;
            boolean[] paired = new boolean[N];
            List<Integer> newCandidates = new ArrayList<>();
            for (int i : candidates) {
                if (paired[i] || current[i] >= N - 1) continue;
                int j = A[i][current[i]];
                if (paired[j]) continue;
                if (A[j][current[j]] == i) {
                    paired[i] = paired[j] = true;
                    current[i]++;
                    current[j]++;
                    change = true;
                    newCandidates.add(i);
                    newCandidates.add(j);
                }
            }
            if (!change) break;
            days++;
            candidates = newCandidates;
        }

        for (int i = 0; i < N; i++) {
            if (current[i] < N - 1) {
                days = -1;
                break;
            }
        }

        System.out.println(days);
    }
}
