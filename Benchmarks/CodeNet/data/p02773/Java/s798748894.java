import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        int n = scanner.nextInt();
        List<String> strings = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine().trim());
        }
        poll(strings).forEach(System.out::println);
    }

    public static List<String> poll(Collection<String> strings){
        Map<String, Long> map = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long maxCount = map.values().stream().max(Long::compareTo).get();
        return map.entrySet().stream().filter(entry->entry.getValue().equals(maxCount))
                .map(Map.Entry::getKey).sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}
