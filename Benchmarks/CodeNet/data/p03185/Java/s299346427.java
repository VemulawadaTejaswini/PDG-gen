import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    /*
    import java.util.*

fun main() {
    val jin = Scanner(System.`in`)
    val n = jin.nextInt()
    val c = jin.nextLong()
    val queue = LinkedList<Pair<Long, Long>>()
    val h1 = jin.nextLong()
    queue.add(Pair(h1, h1 * h1))
    for (i in 1 until n) {
        val h = jin.nextLong()
        while (queue.size > 1 && queue[1].second - (2L * h * queue[1].first) <= queue[0].second - (2L * h * queue[0].first)) {
            queue.removeFirst()
        }
        val dp = queue[0].second - (2L * h * queue[0].first) + (2L * h * h) + c
        while (queue.isNotEmpty() && dp - (2L * h * h) <= queue.last.second - (2L * h * queue.last.first)) {
            queue.removeLast()
        }
        queue.addLast(Pair(h, dp))
    }
    println(queue.last.second - (queue.last.first * queue.last.first))
}
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long c = in.nextLong();
        LinkedList<Stone> queue = new LinkedList<>();
        long h1 = in.nextLong();
        queue.add(new Stone(h1, h1 * h1));
        for (int i = 1; i < n; i++) {
            long h = in.nextLong();
            while (queue.size() > 1 && queue.get(1).dp - (2L * h * queue.get(1).h) <= queue.get(0).dp - (2L * h * queue.get(0).h)) {
                queue.removeFirst();
            }
            long dp = queue.get(0).dp - (2L * h * queue.get(0).h) + (2L * h * h) + c;
            while (!queue.isEmpty() && dp - (2L * h * h) <= queue.getLast().dp - (2L * h * queue.getLast().h)) {
                queue.removeLast();
            }
            queue.addLast(new Stone(h, dp));
        }
        System.out.println(queue.getLast().dp - (queue.getLast().h * queue.getLast().h));
    }

    static class Stone {
        final long h;
        final long dp;

        Stone(long h, long dp) {
            this.h = h;
            this.dp = dp;
        }
    }
}
