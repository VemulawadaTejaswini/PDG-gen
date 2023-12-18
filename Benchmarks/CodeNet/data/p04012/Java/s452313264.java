
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        boolean isOk = w.chars().mapToObj(i -> (char) i).sorted().collect(Collectors.groupingBy(c -> c)).values()
                .stream().allMatch(cs -> cs.size() % 2 == 0);
        if (isOk) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}