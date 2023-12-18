import java.util.*;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }

        List<Integer> sums = new ArrayList<>();
        for (int countA = 0; countA <= K; countA++) {
            for (int countB = 0; countB <= (K - countA); countB++) {
                int countCD = K - countA - countB;

                // 持っている宝石の価値のリスト
                List<Integer> havings = new ArrayList<>();

                // キューを作成
                Deque<Integer> queue = new ArrayDeque();
                for (int i = 0; i < N; i++) {
                    queue.addLast(V[i]);
                }

                // 操作A
                for (int i = countA; i > 0; i--) {
                    Integer tmp = queue.pollFirst();
                    if (tmp == null) {
                        break;
                    }
                    havings.add(tmp);
                }

                // 操作B
                for (int i = countB; i > 0; i--) {
                    Integer tmp = queue.pollLast();
                    if (tmp == null) {
                        break;
                    }
                    havings.add(tmp);
                }
                // 操作CD
                Collections.sort(havings);
                // リスト走査しながら、エントリを削除したいので、Iterator を使用。
                Iterator<Integer> iter = havings.iterator();
                while (iter.hasNext()) {
                    if (iter.next() < 0 && countCD > 0) {
                        iter.remove();
                    } else {
                        break;
                    }
                    countCD--;
                }
                int sum = 0;
                for (Integer having : havings) {
                    sum += having;
                }
                sums.add(sum);
            } // 内 for
        } // 外 for

        Collections.sort(sums, Collections.reverseOrder());
        System.out.print(sums.get(0));
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}