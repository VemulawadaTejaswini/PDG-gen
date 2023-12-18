import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        map.put(sum, 1);
        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        long ans = 0;
        for (int count : map.values()) {
            if (count >= 2) {
                ans += (long)count*(count-1)/2;
            }
        }

        System.out.println(ans);
    }
}

