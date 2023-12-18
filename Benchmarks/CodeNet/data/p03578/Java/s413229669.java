import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int count = map.getOrDefault(d, 0);
            map.put(d, ++count);
        }
        for (int i = 0; i < m; i++) {
            int d = sc.nextInt();
            int count = map.getOrDefault(d, 0);
            if (count == 0) {
                System.out.println("No");
                return;
            }
            map.put(d, --count);
        }
        System.out.println("Yes");
    }
}
