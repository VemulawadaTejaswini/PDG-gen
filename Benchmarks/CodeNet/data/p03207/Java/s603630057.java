import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxIndex = 0;
        int max = 100;
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
            if (prices[i] >= max) {
                maxIndex = i;
                max = prices[i];
            }
        }
        prices[maxIndex] = prices[maxIndex] / 2;

        int sum = 0;
        for (int price: prices) {
            sum += price;
        }
        System.out.println(sum);
    }
}