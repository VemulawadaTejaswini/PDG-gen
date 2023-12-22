import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] Hs = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            Hs[i] = sc.nextLong();
        }
        List<int[]> loads = new ArrayList<>();
        for (int i = 1; i <= M; i++) {
            int[] load = new int[] {sc.nextInt(), sc.nextInt()};
            loads.add(load);
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            long ownH = Hs[i];
            boolean isH = true;
            for (int[] load : loads) {
                if ((load[0] == i && ownH <= Hs[load[1]])
                        || (load[1] == i && ownH <= Hs[load[0]])) {
                    isH = false;
                    break;
                }
            }
            if (isH) {
                count++;
            }
        }
        System.out.println(count);
    }
}