
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {


    private Scanner sc;

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        sc = new Scanner(System.in);
        java.util.Queue<q1_3> queue = new ArrayDeque<q1_3>();
        int n = sc.nextInt();
        int q = sc.nextInt();

        for (int i = 0; i < n; i++) {
            queue.offer(new q1_3(sc.next(), sc.nextInt()));
        }
        int sum = 0;
        while (!queue.isEmpty()) {
            q1_3 now = queue.poll();
            int d = Math.min(q, now.time);
            now.time -= d;
            sum += d;
            if (now.time > 0) {
                queue.offer(now);
            } else {

                System.out.println(now.name + " " + sum);
            }
        }
    }
}

class q1_3 {
    String name;
    int time;

    public q1_3(String name, int time) {
        super();
        this.name = name;
        this.time = time;
    }

}