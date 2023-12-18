
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final List<Queue<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            final Queue<Integer> queue = new LinkedList<>();
            for (int j = 0; j < n - 1; j++) {
                queue.add(in.nextInt() - 1);
            }
            lists.add(queue);
        }
        int count = 0;
        while (true) {
            boolean inProgress = false;
            boolean allEmpty = true;
            final Set<Integer> marks = new HashSet<>();
            for (int i = 0; i < lists.size(); i++) {
                final Queue<Integer> from = lists.get(i);
                if (from.isEmpty()) {
                    continue;
                }
                allEmpty = false;
                final int t = from.peek();
                final Queue<Integer> target = lists.get(t);
                if (target.peek() == i) {
                    marks.add(from.peek());
                    marks.add(target.peek());
                    inProgress = true;
                }
            }
            for (Integer mark : marks) {
                lists.get(mark).remove();
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
