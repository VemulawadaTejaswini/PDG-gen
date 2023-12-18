import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        List<Integer> A = Arrays.asList((s.nextLine().split(" "))).stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean t1 = A.stream().filter(a -> a % 2 == 0).allMatch(a -> a % 3 == 0 || a % 5 == 0);
        System.out.println(t1 ? "APPROVED" : "DENIED");
    }
}