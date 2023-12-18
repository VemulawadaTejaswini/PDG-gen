import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());

        Set<Integer> anSet = new HashSet();
        anSet.add(a);
        anSet.add(b);
        anSet.add(c);
        System.out.print(anSet.size());
    }
}
