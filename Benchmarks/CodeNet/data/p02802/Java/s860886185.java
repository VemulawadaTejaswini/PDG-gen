
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Map<Integer, Boolean> isAc = new HashMap<>();
        Map<Integer, Integer> penalties = new HashMap<>();

        for (int i = 1 ; i <= M ; i++) {
            int p = scanner.nextInt();
            String S = scanner.next();

            if (S.equals("WA") && !isAc.getOrDefault(p, false)) {
                penalties.put(p, penalties.getOrDefault(p, 0) + 1);
            } else {
                isAc.put(p ,true);
            }
        }

        int penaltyCont = penalties.values().stream().reduce(0, (a, b) -> a + b);

        System.out.printf("%d %d%n", isAc.size(), penaltyCont);
    }
}
