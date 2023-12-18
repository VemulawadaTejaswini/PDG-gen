import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0.0d;
        for (int i = 0; i < n; i++) {
            double price = sc.nextDouble();
            String unit = sc.next();

            if (unit.equals("BTC")) {
                sum += price * 380000.0d;
            } else {
                sum += price;
            }
        }

        System.out.println(sum);
    }
}
