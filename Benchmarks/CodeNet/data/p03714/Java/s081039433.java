import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<Integer> digits = new ArrayList<>(3 * N);
        PriorityQueue<Integer> q1 = new PriorityQueue<>(N + 1);
        PriorityQueue<Integer> q2 = new PriorityQueue<>(N + 1, (x1, x2) -> x2 - x1);

        for (int i = 0; i < 3 * N; i++) {
            digits.add(s.nextInt());
            if (i < N) q1.add(digits.get(i));
            if (i >= 2 * N) q2.add(digits.get(i));
        }
        int c1 = q1.stream().mapToInt(Integer::intValue).sum();
        int c2 = q2.stream().mapToInt(Integer::intValue).sum();
        List<Integer> max_s = new ArrayList<>(N + 1);
        List<Integer> min_s = new ArrayList<>(N + 1);
        max_s.add(c1);
        min_s.add(c2);
        for (int i = 0; i < N; i++) {
            int t1 = digits.get(N + i);
            int t2 = digits.get(2*N + i-1);
            q1.add(t1);
            c1 += t1;
            c1 -= q1.poll();
            max_s.add(c1);

            q2.add(t2);
            c2 += t2;
            c2 -= q2.poll();
            min_s.add(c2);
        }
        int score = max_s.get(0) - min_s.get(N);
        // System.out.println(max_s);
        // System.out.println(min_s);
        for (int i = 0; i < N+1; i++) {
            score = Math.max(score, max_s.get(i) - min_s.get(N-i));
        }
        System.out.println(score);

    }
}
