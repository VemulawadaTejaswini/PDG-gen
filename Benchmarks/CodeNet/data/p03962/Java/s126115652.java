import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        scanner.close();

        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        System.out.println(set.size());
    }
}
