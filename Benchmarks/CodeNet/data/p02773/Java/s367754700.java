import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    final Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        IntStream.range(0, n).forEach(i -> {
            String str = sc.next();
            Integer val = map.get(str);
            if (val == null) {
                map.put(str, 1);
            } else {
                map.put(str, val.intValue()+1);
            }
        });
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            max = Math.max(entry.getValue(), max);
        }

        Set<String> set = new TreeSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) set.add(entry.getKey());
        }
        set.forEach(System.out::println);
    }
}
