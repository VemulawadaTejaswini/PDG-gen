
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

        int acCount = 0;
        int pCount = 0;
        
        for (int p : isAc.keySet()) {
            acCount++;
            pCount += penalties.getOrDefault(p, 0);
        }

        System.out.printf("%d %d%n", acCount, pCount);

    }
}
