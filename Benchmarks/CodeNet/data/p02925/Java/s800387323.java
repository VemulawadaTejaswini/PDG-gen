import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int N_1 = N - 1;
        int[][] A = new int[N][N_1];
        int[] index = new int[N];
        int[] addIndex = new int[N];
        int ans = 0;
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < N; i++) {
            map.add(i);
            for (int j = 0; j < N_1; j++) {
                A[i][j] = scanner.nextInt() - 1;
            }
        }

        boolean battle;


        while (!isFinish(index, addIndex, N_1)) {
            addIndex = new int[N];
            battle = false;
            for (Integer i : map) {
                if (index[i] >= N_1 || addIndex[i] == 1) {
                    map.remove(i);
                    continue;
                }
                int target = A[i][index[i]];
                if (i == A[target][index[target]]) {
                    addIndex[i]++;
                    addIndex[target]++;
                    battle = true;
                }
            }
            if (!battle) {
                System.out.println(-1);
                return;
            }
            ans++;
        }


        System.out.println(ans);
    }

    private boolean isFinish(int[] index, int[] addIndex, int n) {
        boolean is = true;
        for (int i = 0; i < index.length; i++) {
            index[i] = (index[i] + addIndex[i]);
            if (index[i] != n) {
                is = false;
            }
        }
        return is;
    }
}