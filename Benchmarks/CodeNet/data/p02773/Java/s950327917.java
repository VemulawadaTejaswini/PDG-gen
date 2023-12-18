import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

/**
 * TITLE : Poll URL : https://atcoder.jp/contests/abc155/tasks/abc155_c
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            if (!map.containsKey(S)) {
                map.put(S, 1);
            }
            else {
                map.put(S, map.get(S).intValue() + 1);
            }
        }
        // map.entrySet().stream().forEach(System.out::println);
        Optional<Entry<String, Integer>> maxEntry = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        map.entrySet().stream().filter(x -> maxEntry.get().getValue() == x.getValue()).sorted(
                Map.Entry.<String, Integer> comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(x -> System.out.println(x.getKey()));
        sc.close();
    }
}