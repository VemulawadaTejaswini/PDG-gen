import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long[] tall = new long[n];
        Map<Long, Long> map = new HashMap<>();
        for (int x = 0; x < n; x++) {
            tall[x] = scan.nextInt();
            map.put(x + tall[x], map.getOrDefault(x + tall[x], (long) 0) + 1);
        }

        long count = 0;
        for (int y = 0; y < n; y++) {
            count += map.getOrDefault(y - tall[y], (long) 0);
        }
      
        System.out.println(count);
    }
}