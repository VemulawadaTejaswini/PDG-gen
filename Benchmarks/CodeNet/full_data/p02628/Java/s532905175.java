import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> prices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            prices.add(scanner.nextInt());
        }

        Collections.sort(prices);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += prices.get(i);
        }

        System.out.println(sum);

    }
}