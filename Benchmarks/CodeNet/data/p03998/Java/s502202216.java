import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        List<Integer>[] a = new List[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.next().chars().mapToObj(ch -> ch - 'a').collect(Collectors.toList());
        }
        int turn = 0;
        while (!a[turn].isEmpty()) {
            turn = a[turn].get(0);
            a[turn].remove(0);
        }
        System.out.println((char)('A' + turn));
    }
}