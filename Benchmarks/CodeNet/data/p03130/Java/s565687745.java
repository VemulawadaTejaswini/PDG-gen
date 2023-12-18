import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(scan.nextInt());
        }

        boolean isYes = list.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().noneMatch(x -> x.getValue() >= 3);
        System.out.print(isYes ? "YES" : "NO");
    }
}
