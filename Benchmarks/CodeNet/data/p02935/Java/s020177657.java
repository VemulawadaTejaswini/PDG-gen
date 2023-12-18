import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new BigDecimal(sc.next()));
        }
        Collections.sort(list);
        Deque<BigDecimal> d = new ArrayDeque();
        for (BigDecimal b : list) {
            d.add(b);
        }
        while (d.size() > 1) {
            BigDecimal x = d.poll();
            BigDecimal y = d.poll();
            d.addFirst(y.add(x).divide(new BigDecimal(2)));
        }
        System.out.println(d.poll());
    }
}