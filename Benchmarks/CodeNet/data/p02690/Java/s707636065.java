
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int x = in.nextInt();
        int t = 0;
        final Map<Long, Integer> map = new HashMap<>();
        while (Math.pow(t, 5) < 1e18) {
            map.put((long) Math.pow(t, 5), t);
            map.put((long) Math.pow(-t, 5), -t);
            t++;
        }
        twoSum(x, map);
    }

    public static void twoSum(int target, Map<Long, Integer> map) {
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            final long num = entry.getKey();
            if (map.containsKey(target + num)) {
                System.out.println(map.get(target + num) + " " + entry.getValue());
                return;
            }
        }
    }
}
