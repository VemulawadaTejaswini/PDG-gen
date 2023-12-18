import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] quantity = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            quantity[i] = sc.nextInt();
        }
        long total = 0;
        for(int i = 1; i <= n; i++) {
            int numPairs = Math.min(quantity[i], quantity[i - 1]);
            total += numPairs;
            quantity[i] -= numPairs;
            quantity[i - 1] -= numPairs;
        }
        for (int i = 1; i <= n; i++) {
            total += quantity[i] / 2;
        }
        System.out.println(total);
    }
}