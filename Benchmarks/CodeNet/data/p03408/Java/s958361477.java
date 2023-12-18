import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> s.add(sc.next()));
        int m = sc.nextInt();
        List<String> t = new ArrayList<>();
        IntStream.range(0, m).forEach(i -> t.add(sc.next()));

        Map<String, Integer> map = new HashMap<>();
        s.forEach(blue -> map.merge(blue, 1, (a, b) -> a + b));
        t.forEach(red -> map.merge(red, -1, (a, b) -> a + b));
        Entry<String, Integer> max = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        if (max.getValue() < 0) {
            System.out.println(0);
            return;
        }
        System.out.println(max.getValue());
    }

}
