import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = "N:S:E:W:R:L".split(":");
        int[][] l = { { 0, 1 }, { 1, 0 }, { 2, 0 }, { 0, 2 }, { 1, 2 }, { 2, 1 } };
        Map<String, int[]> m = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            m.put(s[i], l[i]);
        }
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 1;
            int[] d = { 1, 2, 3 };
            while (n-- > 0) {
                int[] t = m.get(sc.next().charAt(0) + "");
                int p=d[t[0]];
                d[t[0]]=d[t[1]];
                d[t[1]]=7-p;
                sum += d[0];
            }
            System.out.println(sum);
        }
    }
}

