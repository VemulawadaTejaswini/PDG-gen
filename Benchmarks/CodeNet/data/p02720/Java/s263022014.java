
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        Queue<Long> que = new ArrayDeque<>();
        for (long i = 1; i <= 9; i++) {
            que.offer(i);
        }

        int count = 0;
        while(!que.isEmpty()) {

            long target = que.poll();
            count++;
            if (count == K) {
                System.out.println(target);
                break;
            }

            long shimohito = target % 10;
            if (shimohito == 0) {
                que.offer(target * 10);
                que.offer(target * 10 + 1);
            } else if (shimohito == 9) {
                que.offer(target * 10 + 8);
                que.offer(target * 10 + 9);
            } else {
                que.offer(target * 10 + shimohito - 1);
                que.offer(target * 10 + shimohito);
                que.offer(target * 10 + shimohito + 1);
            }
        }

    }
}
