
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        HashSet<Integer> items = new LinkedHashSet<>();

        int min = -1;

        for (int i = 0; i < n; i++) {
            int item = scanner.nextInt();
            if (i == 0) min = item;
            items.add(item);
        }

        if (solve(min, items, k, new HashMap<>(), 0) == 0) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }

    // return winner id 0 means first
    private static int solve(int min, Set<Integer> choices, int k, Map<Integer, Boolean> canWinMemo, int myId) {
        int otherId = 1 - myId;

        if (canWinMemo.containsKey(k)) return canWinMemo.get(k) ? myId : otherId;

        if (k < min) return otherId;
        if (choices.contains(k)) return myId;

        int winnerId = otherId;

        for (int choice : choices) {
            if (choice > k) break;
            if (solve(min, choices, k - choice, canWinMemo, otherId) == myId) {
                winnerId = myId;
                break;
            }
        }
        canWinMemo.put(k, winnerId == myId);
        return winnerId;
    }
}
