import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int[] P = new int[N];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparing(integer -> -integer));
        for (int i = 0; i < P.length; i++) {
            P[i] = sc.nextInt();
        }
        int sum = 0;
        for (int l = 0; l < N; l++) {
            for (int r = l; r < N; r++) {
                queue.add(P[r]);
                Integer poll = queue.poll();
                sum += Optional.ofNullable(queue.peek()).orElse(0);
                queue.add(poll);
            }
            queue.clear();
        }
        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}