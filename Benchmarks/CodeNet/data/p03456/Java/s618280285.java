import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String input = "1 21";
        Scanner sc = new Scanner(input);
        // Scanner sc = new Scanner(System.in);

        Set<Long> set = new HashSet<>();
        for (long i = 0; i < 100100; i++) {
            set.add(i * i);
        }

        String a = sc.next();
        String b = sc.next();

        System.out.println(set.contains(Long.parseLong(a + b)) ? "Yes" : "No");
    }
}
