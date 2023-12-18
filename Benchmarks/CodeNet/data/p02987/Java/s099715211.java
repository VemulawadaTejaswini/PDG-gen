import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String S = scanner.next();
            Map<String, List<String>> collect = Stream.of(S.split(""))
                    .collect(Collectors.groupingBy(Function.identity()));
            if (collect.keySet().size() != 2) {
                System.out.println("false");
            } else if (collect.values().stream().anyMatch(l -> l.size() != 2)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }

}
