import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        String N = sc.next();
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < 4; i++) {
            if (m.containsKey(N.charAt(i))) {
                m.put(N.charAt(i), m.get(N.charAt(i)) + 1);
            } else {
                m.put(N.charAt(i), 1);
            }
        }

        boolean ans = false;
        for (Integer i : m.values()) {
            if (i >= 3) {
                ans = true;
            }
        }

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}
