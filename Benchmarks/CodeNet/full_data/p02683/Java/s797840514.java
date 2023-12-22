import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        Map<Integer, int[]> info = new TreeMap<>(Comparator.reverseOrder());
        int[] CT = new int[M];
        int total = 0;
        for (int i = 0; i < N; i++) {
            int C = sc.nextInt();
            int[] skill = new int[M];
            for (int j = 0; j < M; j++) {
                skill[j] = sc.nextInt();
                CT[j] += skill[j];
            }
            total += C;
            info.put(C, skill);
        }
        for (int max : CT) {
            if (max < X) {
                System.out.println(-1);
                return;
            }
        }
        int delTotal = 0;
        for (Map.Entry<Integer, int[]> e : info.entrySet()) {
            int[] skills = e.getValue();
            boolean deletable = true;
            for (int i = 0; i < M; i++) {
                if (CT[i] - skills[i] < X) {
                    deletable = false;
                    break;
                }
            }
            if (deletable) {
                delTotal += e.getKey();
                for (int i = 0; i < M; i++) {
                    CT[i] -= skills[i];
                }
            }
        }
        System.out.println(total - delTotal);
    }
}