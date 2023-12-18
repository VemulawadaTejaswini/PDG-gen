import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(X);
        for(int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }
        int minValue = 0;
        int prev = queue.poll();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < queue.size(); i++) {
            int num = queue.poll();
            minValue = Math.min(minValue, num);
            set.add(num - prev);
            prev = num;
        }
        Integer[] sorted = new Integer[set.size()];
        set.toArray(sorted);
        Arrays.sort(sorted);
        int ans = sorted[0];
        System.out.println(ans);
    }
}
