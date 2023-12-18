
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
        final Map<Integer, Integer> map = new HashMap<>();
        while (Math.pow(t, 5) < 1e18) {
            map.put((int) Math.pow(t, 5), t);
            map.put((int) Math.pow(-t, 5), -t);
            t++;
        }
        twoSum(x, map);
    }

    public static void twoSum(int target, Map<Integer, Integer> map) {
        for (int num : map.keySet()) {
            if (map.containsKey(target + num)) {
                System.out.println(map.get(target + num) + " " + map.get(num));
                return;
            } else if (map.containsKey(target - num)) {
                System.out.println(map.get(num) + " " + map.get(target - num));
                return;
            }
        }
    }
}
