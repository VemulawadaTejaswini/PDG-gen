import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private static Map<Integer, Integer> map = new HashMap<>();

    private static void increment(Integer key) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
            return;
        }
        map.put(key, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> a.add(sc.nextInt()));
        for (int i = 0; i < n; i++) {
            int num = a.get(i);
            increment(num - 1);
            increment(num);
            increment(num + 1);
        }
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue());
    }

}
