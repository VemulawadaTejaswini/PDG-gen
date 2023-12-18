import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i <= x; i++) {
            map.put(i, Integer.parseInt(scanner.next()));
        }

        Map<Integer, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        String res = "";
        for (Map.Entry<Integer, Integer> sorted : result.entrySet()) {
            res += sorted.getKey() + " ";
        }
        System.out.println(res.trim());
    }
}