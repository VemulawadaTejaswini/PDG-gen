import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            pq.add(a);
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            list.add(new int[] { c, b });
        }
        sc.close();

        // 主処理
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        };
        Collections.sort(list, comparator);

        for (int i = 0; i < m; i++) {
            int b = list.get(i)[1];
            int c = list.get(i)[0];
            for (int j = 0; j < b; j++) {
                int a = pq.peek();
                if (a < c) {
                    pq.poll();
                    pq.add(c);
                } else {
                    break;
                }
            }
        }

        long result = pq.stream().mapToLong(i -> i).sum();

        // 出力
        System.out.println(result);
    }
}
