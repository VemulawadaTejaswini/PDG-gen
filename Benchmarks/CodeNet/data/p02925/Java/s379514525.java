import java.util.*;
import java.util.regex.Pattern;

public class Main {

    static int N;

    static Queue<Integer>[] queues;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        queues = new Queue[N+1];

        for (int i = 1; i <= N; i++) {

            queues[i] = new LinkedList<Integer>();

            for (int j = 0; j < N-1; j++) {

                queues[i].add(s.nextInt());
            }
        }


        boolean repeatFlag = true;

        int max = -1;

        int day[] = new int[N+1];

        while (repeatFlag) {

            repeatFlag = false;

            boolean endFlag = true;

            for (int i = 1; i <= N; i++) {

                Queue<Integer> queue = queues[i];

                if (queue.isEmpty() == true) continue;

                repeatFlag = true;



                int firstTeam = queue.peek();

                if (queues[firstTeam].peek() == i) {

                    endFlag = false;

                    int newDay = Math.max(day[firstTeam], day[i]) + 1;

                    day[firstTeam] = newDay;

                    day[i] = newDay;

                    max = Math.max(max, newDay);

                    queues[firstTeam].poll();

                    queue.poll();

                }
            }

            if (endFlag == true && repeatFlag == true) {

                System.out.println(-1);

                return;
            }
        }

        System.out.println(max);
    }
}
