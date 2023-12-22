import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Map<String, Integer>> m = new ArrayList<Map<String, Integer>>();
        for (int i = 0; i < 5; i++) {
            m.add(new TreeMap<String, Integer>());
        }
        for (int i = 0; i < n; i++) {
            String p = sc.next();
            int x = sc.nextInt();
            if (m.get(p.length() - 1).containsKey(p)) {
                x += m.get(p.length() - 1).get(p);
            }
            m.get(p.length() - 1).put(p, x);
        }
        for (int i = 0; i < 5; i++) {
            for (Entry<String, Integer> e : m.get(i).entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
