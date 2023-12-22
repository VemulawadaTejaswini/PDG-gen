import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> dicionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            if (s1.equals("insert")) {
                dicionary.add(s2);
            }
            else {
                System.out.println(dicionary.contains(s2) ? "yes" : "no");
            }
        }
    }
}
