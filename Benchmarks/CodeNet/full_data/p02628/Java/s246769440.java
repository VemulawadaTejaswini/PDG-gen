import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int sum = 0;
        int[] prices = new int[N];
        for (int i = 0; i < K; i++){
            prices[i] = scanner.nextInt();
        }
        Arrays.sort(prices);
        for (int i = 0; i < K; i++) {
            sum += prices[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}
