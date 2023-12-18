import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        TreeMap<Long, Long> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            map.put(sc.nextLong(), sc.nextLong());
        }
        long minYen = 0;
        for(long yen: map.keySet()) {
            long amount = map.get(yen);
            if(amount < m) {
                minYen += (amount * yen);
                m -= amount;
            } else {
                minYen += (m * yen);
                break;
            }
        }
        System.out.println(minYen);
    }
}
