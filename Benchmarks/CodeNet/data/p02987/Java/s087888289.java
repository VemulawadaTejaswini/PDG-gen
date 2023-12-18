import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : S) {
            Integer count = map.get(c);
            if (count == null) {
                count = 0;
            }
            map.put(c, ++count);
        }

        if (map.size() != 2) {
            System.out.println("No");
            return;
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() != 2) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}