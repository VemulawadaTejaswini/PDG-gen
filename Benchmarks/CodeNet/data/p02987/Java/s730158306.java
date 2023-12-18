
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final String line = in.next();
        final Map<Character, Integer> map = new HashMap<>();

        for (char c : line.toCharArray()) {
            map.compute(c, (character, integer) -> {
                final int result;
                if (integer == null) {
                    result = 1;
                } else {
                    result = integer + 1;
                }
                return result;
            });
        }

        if (map.keySet().size() != 2) {
            System.out.println("No");
            return;
        }

        if (map.values().stream().anyMatch(i -> i != 2)) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
