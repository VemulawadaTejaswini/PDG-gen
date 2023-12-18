import java.util.*;

public class Main {
//    private static final String ex = "5\n" +
//            "1 2 1\n" +
//            "1 3 1\n" +
//            "2 4 1\n" +
//            "3 5 1\n" +
//            "3 1\n" +
//            "2 4\n" +
//            "2 3\n" +
//            "4 5";
    private static final String ex = "10\n" +
        "1 2 1000000000\n" +
        "2 3 1000000000\n" +
        "3 4 1000000000\n" +
        "4 5 1000000000\n" +
        "5 6 1000000000\n" +
        "6 7 1000000000\n" +
        "7 8 1000000000\n" +
        "8 9 1000000000\n" +
        "9 10 1000000000\n" +
        "1 1\n" +
        "9 10";
//    private static final String ex = "7\n" +
//            "1 2 1\n" +
//            "1 3 3\n" +
//            "1 4 5\n" +
//            "1 5 7\n" +
//            "1 6 9\n" +
//            "1 7 11\n" +
//            "3 2\n" +
//            "1 3\n" +
//            "4 5\n" +
//            "6 7";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static String solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        Map<Integer, Map<Integer, Long>> tree = new HashMap<>();

        for (int i = 0; i < N - 1; i ++) {
            String[] split = scanner.nextLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            long c = Long.parseLong(split[2]);

            put(tree, a, b, c);
            put(tree, b, a, c);
        }

        String[] split = scanner.nextLine().split(" ");
        int Q = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        tree.get(K).put(K, 0L);

        Map<Integer, Long> distance = new HashMap<>();
        fillDistance(0, K, tree, distance);

        List<String> answers = new LinkedList<>();
        for (int i = 0; i < Q; i ++) {
            split = scanner.nextLine().split(" ");

            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);

            long answer = distance.get(x) + distance.get(y);
            answers.add(String.valueOf(answer));
        }

        return String.join("\n", answers);
    }

    private static void fillDistance(long currentDistance,
                                     int node,
                                     Map<Integer, Map<Integer, Long>> tree,
                                     Map<Integer, Long> distance) {
        if (distance.keySet().contains(node)) return;

        distance.put(node, currentDistance);

        Map<Integer, Long> innerMap = tree.get(node);
        for (Integer nextNode: innerMap.keySet()) {
            fillDistance(currentDistance + innerMap.get(nextNode), nextNode, tree, distance);
        }
    }

    private static void put(Map<Integer, Map<Integer, Long>> map, int a, int b, long c) {
        Map<Integer, Long> innerMap = map.getOrDefault(a, new HashMap<>());
        innerMap.put(b, c);
        map.put(a, innerMap);
    }
}
