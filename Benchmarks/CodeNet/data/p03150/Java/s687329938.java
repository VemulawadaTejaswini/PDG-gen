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
        HashMap<Character, List<Integer>> map = new HashMap<>();
        char[] data = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (!map.containsKey(data[i])) {
                map.put(data[i], new LinkedList<>());
            }
            List<Integer> list = map.get(data[i]);
            list.add(i);
        }
        char[] keyence = {'k','e','y','e','n','c','e'};
        long current = -1;
        for (char x : keyence) {
            if (!map.containsKey(x)) {
                System.out.println("NO");
                return;
            }
            List<Integer> list = map.get(x);
            if (list.size() == 0) {
                System.out.println("NO");
                return;
            }
            boolean found = false;
            long next = -1;
            while (!list.isEmpty()) {
                next = list.remove(0);
                if (current < next) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
                return;
            }
            current = next;
        }
        System.out.println("YES");
    }
}
