import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt() - 1;
        }

        List<Integer> loopedTown = getLoopedTown(A);

        // おそらくintに収まるはず
        int mod = (int) (K % loopedTown.size());

        System.out.println(loopedTown.get(mod) + 1);
    }

    public static List<Integer> getLoopedTown(int[] A) {
        ArrayList<Integer> visit = new ArrayList<>();
        // 最初の町は1
        int currentTown = 0;
        int cnt = 0;

        while (true) {
            visit.add(currentTown);
            int find = visit.indexOf(currentTown);

            if (find != -1 && find != cnt) {
                // その街への2回めの訪問
                return visit.subList(find, cnt);
            }

            cnt++;
            currentTown = A[currentTown];
        }
    }
}
