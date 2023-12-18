import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] l = scanner.nextLine().trim().split(" ");
        int n = Integer.valueOf(l[0]);
        int m = Integer.valueOf(l[1]);

        Set<Integer> accepted = new HashSet<>();
        int failed = 0;

        for (int i = 0; i < m; i++) {
            String[] submission = scanner.nextLine().trim().split(" ");
            int problem = Integer.valueOf(submission[0]);
            String result = submission[1];

            if ("AC".equalsIgnoreCase(result)) {
                accepted.add(problem);
            } else if (!accepted.contains(problem)) {
                failed++;
            }

            if (accepted.size() == n) {
                break;
            }
        }

        System.out.println(accepted.size() + " " + failed);
    }
}