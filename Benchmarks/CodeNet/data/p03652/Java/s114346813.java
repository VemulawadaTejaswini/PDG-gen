import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayDeque<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayDeque<Integer> deq = new ArrayDeque<>();
            for (int j = 0; j < m; j++) {
                deq.add(sc.nextInt());
            }
            list.add(deq);
        }
        boolean[] canceled = new boolean[m + 1];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            int[] counts = new int[m + 1];
            for (ArrayDeque<Integer> deq : list) {
                while (canceled[deq.peek()]) {
                    deq.poll();
                }
                counts[deq.peek()]++;
            }
            int max = 0;
            int maxIdx = 0;
            for (int j = 1; j <= m; j++) {
                if (max < counts[j]) {
                    max = counts[j];
                    maxIdx = j;
                }
            }
            min = Math.min(min, max);
            canceled[maxIdx] = true;
        }
        System.out.println(min);
    }
}
