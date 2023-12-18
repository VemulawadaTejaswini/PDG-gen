
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            map.put(a, b);
        }
        int current = 0;
        long ans = 0;
        for(long key : map.keySet()) {
            long num = map.get(key);
            if(current + num > M) {
                ans += key * (M - current);
                break;
            }
            else {
                ans += key * num;
            }
            current += num;
        }
        System.out.println(ans);
    }
}