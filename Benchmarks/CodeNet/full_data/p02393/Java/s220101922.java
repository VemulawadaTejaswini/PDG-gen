import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());

        List<Integer> list = Arrays.asList(a, b, c);
        List<String> stringList = list.stream()
                .sorted(Comparator.naturalOrder())
                .map(integer -> String.valueOf(integer.intValue()))
                .collect(Collectors.toList());

        String answer = String.join(" ", stringList);

        System.out.println(answer);
    }
}