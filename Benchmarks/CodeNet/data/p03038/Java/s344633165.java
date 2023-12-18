import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < m; i++) {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            for (int j = 0; j < b; j++) {
                if (q.peek() >= c) {
                    break;
                } else {
                    q.poll();
                    q.add(c);
                }
            }
        }
        System.out.println(q.stream().mapToLong(x -> x).sum());
    }
}