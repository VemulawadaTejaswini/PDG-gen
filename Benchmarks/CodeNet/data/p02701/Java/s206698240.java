
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Set<String> prize = new HashSet<>();

        for (int i = 0 ; i < N ; i++) {
            prize.add(scanner.next());
        }

        System.out.println(prize.size());
    }
}
