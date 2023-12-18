import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        ArrayList<Swap> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list.add(new Swap(sc.nextInt(), sc.nextInt()));
        }

        list.sort((sa, sb) -> sb.value - sa.value);

        int count = 0;
        for (Swap s : list) {
            int add = Math.min(n - count, s.count);
            for (int i = 0; i < add; i++) {
                a.add(s.value);
            }
            count += add;
            if (count == n) {
                break;
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += a.poll();
        }

        System.out.println(ans);
    }

    private static class Swap {
        private int count;
        private int value;

        public Swap(int count, int value) {
            this.count = count;
            this.value = value;
        }
    }
}
