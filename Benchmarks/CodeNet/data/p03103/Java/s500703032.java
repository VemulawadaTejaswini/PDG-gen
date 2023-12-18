import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Queue<Integer> q = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            q.add(temp);
            map.put(temp, Integer.parseInt(sc.next()));
        }
        long ans = 0;
        for (int i = 0; i < m; i++) {
            int temp = q.peek();
            ans += temp;
            int num = map.get(temp) - 1;
            if (num == 0) {
                q.poll();
            } else {
                map.put(temp, num);
            }

        }
        System.out.println(ans);
    }
}
