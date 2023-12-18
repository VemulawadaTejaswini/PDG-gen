import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        int m = nextInt(scanner);
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = nextInt(scanner);
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i + 1, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = nextInt(scanner);
            int b = nextInt(scanner);
            map.get(a).add(b);
            map.get(b).add(a);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int highest = 0;
            for (int j : map.get(i + 1)) {
                if (h[j - 1] > highest) {
                    highest = h[j - 1];
                }
            }
            if (h[i] > highest) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}
