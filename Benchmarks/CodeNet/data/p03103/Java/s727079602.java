import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Long, Long> drink = new HashMap<>();
        for (int i = 0; i < n; i++) {
            drink.put(sc.nextLong(), sc.nextLong());
        }

        Object[] drink_money = drink.keySet().toArray();
        Arrays.sort(drink_money);
        long bottle = 0;
        long money = 0;


        for (int i = 0; i < n; i++) {
            long d_money = Integer.valueOf(String.valueOf(drink_money[i]));
            long d_bottle = Integer.valueOf(String.valueOf(drink.get(d_money)));
            if (bottle + d_bottle <= m) {
                System.out.println(d_money + " " + d_bottle);
                bottle += d_bottle;
                money += d_money * d_bottle;
            } else {
                System.out.println(d_money + " " + (m - bottle));
                money += d_money * (m - bottle);
                break;
            }
        }
        System.out.println(money);

    }
}
