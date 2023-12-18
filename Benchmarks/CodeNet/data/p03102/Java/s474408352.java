import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int target = Integer.parseInt(sc.next());
        int[] base = new int[m];
        for (int i = 0; i < m; i++) {
            base[i] = Integer.parseInt(sc.next());
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += Integer.parseInt(sc.next()) * base[j];
            }
            if (sum + target > 0) cnt++;
        }
        System.out.println(cnt);
    }
}