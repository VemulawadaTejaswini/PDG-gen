import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), sc.nextInt());
        }
        
        long count = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int num = e.getKey();
            int price = e.getValue();
            if (m == 0) break;
            if (m - num >= 0) {
                count += num * price;
                m -= num;
            } else {
                count += m * price;
                m = 0;
            }
        }
        System.out.println(count);
    }
}
