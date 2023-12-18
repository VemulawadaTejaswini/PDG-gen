
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static class Player {
        int[] expected;
        int index;
        boolean played;

        public Player(int[] expected) {
            this.expected = expected;
        }

        public void play() {
            index++;
            played = true;
        }

        public int who() {
            return expected[index];
        }

        public boolean isDone() {
            return index == expected.length;
        }
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final Map<Integer, Player> lists = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final Queue<Integer> queue = new LinkedList<>();
            int[] expected = new int[n - 1];
            for (int j = 0; j < n - 1; j++) {
                expected[j] = in.nextInt() - 1;
            }
            lists.put(i, new Player(expected));
        }
        int count = 0;
        while (true) {
            boolean inProgress = false;
            boolean allEmpty = true;
            final Set<Integer> marks = new HashSet<>();
            for (Map.Entry<Integer, Player> entry : lists.entrySet()) {
                final Integer i = entry.getKey();
                final Player from = entry.getValue();
                if (from.isDone() || from.played) {
                    continue;
                }
                allEmpty = false;
                final int t = from.who();
                final Player target = lists.get(t);
                if (!target.played && target.who() == i) {
                    from.play();
                    target.play();
                    marks.add(i);
                    marks.add(t);
                    inProgress = true;
                }
            }
            for (Integer mark : marks) {
                Player player = lists.get(mark);
                player.played = false;
                if (player.isDone()) {
                    lists.remove(mark);
                }
            }
            if (allEmpty) {
                break;
            }
            count++;
            if (!inProgress) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}
