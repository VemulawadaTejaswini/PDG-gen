import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> n_q = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int q = n_q.get(1);
        Queue<String> qu = new ArrayBlockingQueue<>(n_q.get(0));
        int t = 0;
        while(sc.hasNext()) {
            qu.add(sc.nextLine());
        }
        while(!qu.isEmpty()) {
            String[] name_time = qu.poll().split(" ");
            int time = Integer.parseInt(name_time[1]);
            if (time > q) {
                time -= q;
                t += q;
                qu.add(name_time[0] + " " + time);
            } else {
                t += time;
                System.out.println(name_time[0] + " " + t);
            }
        }
    }
}


