import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] current = sc.next().split("");
            Arrays.sort(current);
            for (String tmp : current) {
                sb.append(tmp);
            }
            if (!map.containsKey(sb.toString())) {
                map.put(sb.toString(), 0);
            } else {
                map.put(sb.toString(), map.get(sb.toString()) + 1);
            }
            sb.setLength(0);
        }
        int ans = 0;
        for (int i : map.values()) {
            ans += i;
        }
        System.out.println(ans);
    }
}
