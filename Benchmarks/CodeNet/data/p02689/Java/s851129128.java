import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < n; x++) {
            map.put(scan.nextInt(), x);
        }

        HashSet<Integer> hash = new HashSet<>();
        for (int y = 0; y < m; y++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (map.get(a) == null && map.get(b) == null) {
                continue;
            }

            if (map.get(a) == null) {
                hash.add(b);
                continue;
            }

            if (map.get(b) == null) {
                hash.add(a);
                continue;
            }

            if (map.get(a) >= map.get(b)) {
                hash.remove(b);
                hash.add(a);
            } else {
                hash.remove(a);
                hash.add(b);
            }
        }
      
        System.out.println(hash.size());
    }
}