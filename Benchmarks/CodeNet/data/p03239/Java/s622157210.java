import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            int t = sc.nextInt();
            m.put(c, t);
        }

        int ans = 0;
        boolean flag = false;
        for (int i : m.keySet()) {
            if (m.get(i) <= T) {
                ans = i;
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(ans);
        } else {
            System.out.println("TLE");
        }
    }
}
