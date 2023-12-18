import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        Optional<Map.Entry<String, Integer>> target = map.entrySet().stream().max((e1, e2)-> e1.getValue().compareTo(e2.getValue()));
        int max = target.get().getValue();
        map.entrySet().stream().filter(e->e.getValue() == max).sorted(Map.Entry.comparingByKey()).forEach(e-> System.out.println(e.getKey()));
    }
}
