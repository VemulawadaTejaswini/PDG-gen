import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] P = new int[N];
            int[] Q = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                Q[i] = sc.nextInt();
            }

            ArrayList<String> list = new ArrayList<>();
            dfs(0, N, new boolean[N + 1], "", list);
            Collections.sort(list);

            String sp = "";
            for (int i = 0; i < N; i++) {
                sp += P[i];
            }

            String sq = "";
            for (int i = 0; i < N; i++) {
                sq += Q[i];
            }

            int a = 0;
            int b = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(sp)) {
                    a = i;
                    break;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(sq)) {
                    b = i;
                    break;
                }
            }

            System.out.println(Math.abs(a - b));
        }
    }

    private static void dfs(int i, int N, boolean[] used, String s, ArrayList<String> list) {
        if (i >= N) {
            list.add(s);
            return;
        }

        for (int n = 1; n <= N; n++) {
            if (used[n]) {
                continue;
            }
            used[n] = true;
            dfs(i + 1, N, used, s + n, list);
            used[n] = !true;
        }
    }

}