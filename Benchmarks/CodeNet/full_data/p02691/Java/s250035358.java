import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if(map.containsKey(i-A[i])) {
                ans += map.get(i-A[i]);
            }
            int c = A[i] + i;
            int count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
        }
        System.out.println(ans);
    }
}