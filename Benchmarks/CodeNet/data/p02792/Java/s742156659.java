import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            List<Integer> p = conv(i);
            map.put(p, map.getOrDefault(p, 0)+1);
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            List<Integer> p = conv(i);
            List<Integer> q = new ArrayList<>();
            q.add(p.get(1));
            q.add(p.get(0));
            ans += map.getOrDefault(q, 0);
        }

        System.out.println(ans);
    }

    private static List<Integer> conv(int x) {

        int b = x%10;
        int a = x;
        while (x > 0) {
            a = x;
            x /= 10;
        }

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        return list;
    }
}
