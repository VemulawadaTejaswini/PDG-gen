import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> baito = new ArrayList<ArrayList<Integer>>(m) {{
            for (int i = 0; i < m; i++) {
                add(new ArrayList<Integer>() {
                });
            }
        }};

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (--a < m) baito.get(a).add(b);
        }

        int tot = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
        for (int i = 0; i < m; i++) {
            pq.addAll(baito.get(i));

            if (!pq.isEmpty()) tot += pq.poll();
        }
        System.out.println(tot);
    }

    static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer i, Integer j) {
            return j - i;
        }
    }
}