import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += X[i];
            }
            int mean = sum / N;

            int min = (int) 1e9;
            min = Math.min(min, calculateCost(N, X, mean));
            min = Math.min(min, calculateCost(N, X, mean + 1));

            System.out.println(min);
        }
    }

    private static int calculateCost(int N, int[] X, int mean) {
        int cost = 0;
        for (int i = 0; i < N; i++) {
            cost += (X[i] - mean) * (X[i] - mean);
        }
        return cost;
    }
}