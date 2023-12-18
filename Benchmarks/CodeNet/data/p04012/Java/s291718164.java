import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        boolean nonEvenExists = w.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(e -> e.getValue() % 2 == 1);
        System.out.println(nonEvenExists ? "No" : "Yes");
    }
}
