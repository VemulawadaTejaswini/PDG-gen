import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        List<int[]> info = new ArrayList<>();
        int[] CT = new int[M + 1];
        int total = 0;
        for (int i = 0; i < N; i++) {
            int[] skill = new int[M + 1];
            skill[0] = sc.nextInt();
            for (int j = 1; j <= M; j++) {
                skill[j] = sc.nextInt();
                CT[j] += skill[j];
            }
            total += skill[0];
            info.add(skill);
        }
        for (int i = 1; i <= M; i++) {
            if (CT[i] < X) {
                System.out.println(-1);
                return;
            }
        }
        List<int[]> sorted = info.stream()
                .sorted((o1, o2) -> o2[0] - o1[0])
                .collect(Collectors.toList());

        int delTotal = 0;
        for (int[] skills : sorted) {
            boolean deletable = true;
            for (int i = 1; i <= M; i++) {
                if (CT[i] - skills[i] < X) {
                    deletable = false;
                    break;
                }
            }
            if (deletable) {
                delTotal += skills[0];
                for (int i = 1; i <= M; i++) {
                    CT[i] -= skills[i];
                }
            }
        }
        System.out.println(total - delTotal);
    }
}