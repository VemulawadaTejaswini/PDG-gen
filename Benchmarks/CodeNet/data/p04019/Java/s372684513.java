import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] d = S.toCharArray();
        Deque<Character> ns = new ArrayDeque<>();
        Deque<Character> ew = new ArrayDeque<>();
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 'N' || d[i] == 'S') {
                if (!ns.isEmpty() && ns.getLast() == d[i]) {
                    continue;
                }
                ns.add(d[i]);
            }
            if (d[i] == 'E' || d[i] == 'W') {
                if (!ew.isEmpty() && ew.getLast() == d[i]) {
                    continue;
                }
                ew.add(d[i]);
            }
        }
        if (ns.size() == 1 || ew.size() == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
