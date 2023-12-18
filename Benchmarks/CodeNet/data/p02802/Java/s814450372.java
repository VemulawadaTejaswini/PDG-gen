
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // ACになった数字をいれておくやつ
        Set<Integer> collectSet = new HashSet<>();

        // penaltyの番号、カウント
        Map<Integer, Integer> penaltyMap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            String s = sc.next();

            if ("AC".equals(s)) {
                collectSet.add(p);
            } else if (!collectSet.contains(p)) {
                int value = penaltyMap.getOrDefault(p, 0);
                penaltyMap.put(p, value + 1);
            }
        }

        int penaltyCount = 0;
        for (int num : collectSet) {
            penaltyCount += penaltyMap.getOrDefault(num, 0);
        }

        System.out.println(collectSet.size() + " " + penaltyCount);
    }

}