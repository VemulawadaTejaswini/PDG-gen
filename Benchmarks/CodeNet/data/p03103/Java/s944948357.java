import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();

        TreeMap<Long, Integer> priceToStock = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            long price = sc.nextLong();
            int stock = sc.nextInt();
            if (priceToStock.containsKey(price)) {
                int prevStock = priceToStock.get(price);
                priceToStock.put(price, stock + prevStock);
            } else {
                priceToStock.put(price, stock);
            }
        }
        long ans = 0;
        for (Map.Entry<Long, Integer> entry: priceToStock.entrySet()) {
            long price = entry.getKey();
            int stock = entry.getValue();
            if (M > stock) {
                //終わらない
                M -= stock;
                ans += price * (long) stock;
            } else {
                //終わり
                ans += price * M;
                break;
            }
        }

        System.out.println(ans);
    }
}
