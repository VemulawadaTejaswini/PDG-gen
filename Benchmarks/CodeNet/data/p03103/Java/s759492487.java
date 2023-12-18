import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = map.getOrDefault(a, 0);
            map.put(a, count + b);
        }
        
        List<Integer> minL = new ArrayList<>(map.keySet());
        Collections.sort(minL);
        
        int ans = 0;
        for (int min : minL) {
            int count = map.get(min);
            if (m < count) {
                ans += m * min;
                break;
            }
            ans += count * min;
            m -= count;
        }
        System.out.println(ans);
    }
}