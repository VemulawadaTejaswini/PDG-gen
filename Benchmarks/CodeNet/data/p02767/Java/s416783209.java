import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int p = 0; p <= 100; p++) {

            int cost = 0;
            for (int i = 0; i < N; i++) {
                cost += (X[i] - p) * (X[i] - p);
            }

            minCost = Math.min(cost, minCost);
        }

        System.out.println(minCost);
    }
}
