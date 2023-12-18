import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    final int MAX_N = 2 * 100000;
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            int idx = scan.nextInt() - i;
            int value = 0;
            if (a.containsKey(idx))
                value = a.get(idx);
            a.put(idx, value + 1);
        }
        int max = 0;
        int b = 0;
        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                b = entry.getKey();
            }
        }
        int ans = 0;
//        System.out.println(b);
        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            ans += Math.abs((entry.getKey() - b) * entry.getValue());
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
