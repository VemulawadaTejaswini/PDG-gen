import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int N;
        int[] Ai;
        Set<Integer> searched = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ai = new int[N];
            for (int i = 0; i < N; i++) {
                Ai[i] = sc.nextInt();
            }
        }
        queue.add(0);
        searched.add(0);

        while (!queue.isEmpty()) {
            Integer i = queue.poll();
            if (i == 1) {
                System.out.println(searched.size() - 1);
                return;
            }
            Integer t = Ai[i] - 1;
            if (!searched.contains(t)) {
                queue.add(t);
                searched.add(t);
            }
        }
        System.out.println(-1);
    }
}
