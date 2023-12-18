import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            Integer saved = map.get(v);
            map.put(v, saved == null ? 1 : ++saved);
        }
        int m  = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int need = sc.nextInt();
            Integer saved = map.get(need);
            if (saved == null || saved == 0) {
                System.out.println("NO");
                return;
            }
            map.put(need, --saved);
        }
        System.out.println("YES");
    }
}