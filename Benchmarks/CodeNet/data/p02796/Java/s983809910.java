import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int L = sc.nextInt();
            if (!set.contains(X-L)) {
                set.add(X-L);
                pq.offer(X-L);
            }
            if (!set.contains(X+L)) {
                set.add(X+L);
                pq.offer(X+L);
            }
            map.put(X-L, map.getOrDefault(X-L,0)+1);
            map.put(X+L, map.getOrDefault(X+L,0)-1);
        }

        //System.out.println(map);

        int del = 0;
        int sum = 0;
        while (!pq.isEmpty()) {
            int x = pq.poll();
            int prevSum = sum;
            sum += map.get(x);
            //System.out.println("x " + x + ", prevSum " + prevSum + " " + sum);
            if (prevSum > sum) {
                del += prevSum - Math.max(sum, 1);
            }
        }

        System.out.println(N-del);
    }
}
