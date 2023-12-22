import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            final int ROOM = s.nextInt(), PATH = s.nextInt();
            var paths = new HashMap<Integer, Set<Integer>>();
            for (int i = 0; i < PATH; i++) {
                int a = s.nextInt(), b = s.nextInt();
                paths.computeIfAbsent(a, k -> new HashSet<>()).add(b);
                paths.computeIfAbsent(b, k -> new HashSet<>()).add(a);
            }
            var sign = new HashMap<Integer, Integer>();
            sign.put(1, 0);
            var queue = new ArrayDeque<Integer>();
            queue.add(1);
            while (!queue.isEmpty()) {
                Integer i = queue.pollFirst();
                var to = paths.get(i);
                for (Integer j : to) {
                    if (sign.containsKey(j)) {
                        continue;
                    }
                    sign.put(j, i);
                    queue.add(j);
                }
            }
            System.out.println("Yes");
            for (int i = 2; i <= ROOM; i++) {
                System.out.println(sign.get(i));
            }
        }
    }
}
