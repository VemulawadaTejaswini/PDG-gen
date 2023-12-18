import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String a = scanner.next();
            String b = scanner.next();
            Set<String> l = new TreeSet<>();
            l.add(IntStream.range(0, Integer.parseInt(b)).mapToObj(i -> a).collect(Collectors.joining()));
            l.add(IntStream.range(0, Integer.parseInt(a)).mapToObj(i -> b).collect(Collectors.joining()));
            System.out.println(l.toArray()[0]);
        }
    }

}
