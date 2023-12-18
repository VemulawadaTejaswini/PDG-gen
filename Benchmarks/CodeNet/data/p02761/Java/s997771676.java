import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<m;i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            Integer val = map.get(s[i]);
            if (val != null && val != c[i]) {
                System.out.println("-1");
                return;
            }

            if (n > 1 && s[i] == 1 && c[i] == 0) {
                System.out.println("-1");
                return;
            }
            map.put(s[i], c[i]);
        }
        if (n == 1 && m == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1;i<=n;i++) {
            Integer val = map.getOrDefault(i, 0);
            if (i == 1 && val == 0) val = 1;
            sb.append(val);
        }
        System.out.println(sb.toString());
    }
}