import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            map.put(sc.nextInt(), sc.nextInt());
        }
        long minYen = 0;
        for(int yen: map.keySet()) {
            int amount = map.get(yen);
            if(amount < m) {
                minYen += ((long)amount * yen);
                m -= amount;
            } else {
                minYen += ((long)m * yen);
                break;
            }
        }
        System.out.println(minYen);
    }
}
