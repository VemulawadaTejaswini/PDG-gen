import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        List<int[]> al = new ArrayList<>();
        genA(1, 1, new int[N + 1], al);

        int Q = sc.nextInt();
        List<int[]> vals = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            vals.add(new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()});
        }

        int max = 0;
        for (int[] A : al) {
            int score = 0;
            for (int[] val : vals) {
                if (A[val[1]] - A[val[0]] == val[2]) {
                    score += val[3];
                }
            }
            if (max < score) {
                max = score;
            }
        }
        System.out.println(max);
    }

    private static void genA(int idx, int min, int[] base, List<int[]> al) {

        for (int i = min; i <= M; i++) {
            int[] na = clone(base);
            na[idx] = i;
            if (N < idx + 1) {
                al.add(na);
            } else {
                genA(idx + 1, i, na, al);
            }
        }
    }

    private static int[] clone(int[] base) {

        int[] clone = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            clone[i] = base[i];
        }
        return clone;
    }
}