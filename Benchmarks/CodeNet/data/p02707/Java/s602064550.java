
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < N-1; i++) {
            Integer A = Integer.parseInt(scanner.next()) -1;
            Integer count = map.get(A);
            map.put(A, (count == null) ? 1 : count + 1);
        }

        Integer[] total = new Integer[N];
        Arrays.fill(total, 0);

        for (Integer nKey: map.keySet()) {
            total[nKey] = map.get(nKey);
        }

        for (int i = 0; i < N; i++) System.out.println(total[i]);
    }
}
