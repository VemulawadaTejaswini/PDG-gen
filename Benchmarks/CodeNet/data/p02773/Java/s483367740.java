import java.util.*;

// C - Poll
// https://atcoder.jp/contests/abc155/tasks/abc155_c
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        scanner.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // count: desc, word: asc
        list.sort((o1, o2) -> {
            int compare = o2.getValue() - o1.getValue();
            if (compare == 0) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return compare;
        });

        int maxCount = list.get(0).getValue();
        for (Map.Entry<String, Integer> entry : list) {
            if (maxCount == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
