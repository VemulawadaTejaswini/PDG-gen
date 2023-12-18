import java.util.*;

public class Main {
    static HashMap<Integer, Integer> map;
    static void map_put(Integer x) {
        if (map.containsKey(x)) {
            map.put(x, map.get(x)+1);
        } else {
            map.put(x, 1);
        }
    }
    static void map_minus(Integer x) {
        map.put(x, map.get(x)-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next())-1;
        }

        map = new HashMap<Integer, Integer>();
        long[] ruiseki = new long[N+1];
        for (int i=0;i<N;i++) {
            ruiseki[i+1] = ruiseki[i]+A[i];
        }
        for (int i=0;i<N+1;i++) {
            ruiseki[i] %= K;
        }

        int left = 0;
        int right = 0;
        long ans = 0L;
        while (right<Math.min(K, N+1)) {
            map_put((int)ruiseki[right]);
            right++;
        }
        while (left<N) {
            int aa = (int)ruiseki[left];
            ans += map.get(aa)-1;
            map_minus((int)ruiseki[left]);
            left++;
            if (right==N+1) continue;
            map_put((int)ruiseki[right]);
            right++;
        }
        System.out.println(ans);
    }
}