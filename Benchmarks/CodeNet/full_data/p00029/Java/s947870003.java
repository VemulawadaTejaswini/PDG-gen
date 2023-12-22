import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Map<String, Integer> map = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String str = scanner.next();
                if (!map.containsKey(str)) {
                    map.put(str, 0);
                }
                int integer = map.get(str);
                map.put(str, integer + 1);
            }
            String mostWord = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
            String minWord  = map.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).get().getKey();
            System.out.printf("%s %s\n", mostWord, minWord);
        } catch (Exception e) {

        }
    }
}