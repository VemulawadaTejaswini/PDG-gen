import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = std.nextInt();
        }

        Map<Integer, Integer> counting = new HashMap<>();
        for (int i = 0; i < n; i++) {
            counting.put(a[i], counting.getOrDefault(a[i], 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> it = counting.entrySet().iterator();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        while (it.hasNext()) {
            pq.add(it.next());
        }

        long sum = 0;
        while (pq.size() > k) {
            sum += pq.poll().getValue();
        }

        System.out.println(sum);
    }
}
