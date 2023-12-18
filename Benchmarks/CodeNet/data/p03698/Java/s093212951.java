import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        boolean[] used = new boolean[26];
        for (char c : scanner.next().toCharArray()) {
            if (used[c - 'a']) {
                System.out.println("no");
                return;
            }
            used[c - 'a'] = true;
        }
        System.out.println("yes");
    }
}