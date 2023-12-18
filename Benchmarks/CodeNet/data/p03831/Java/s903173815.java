import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        long A = Long.parseLong(scanner.next());
        long B = Long.parseLong(scanner.next());
        Long[] X = new Long[N];
        for (int i = 0; i < N; i++) {
            X[i] = Long.parseLong(scanner.next());
        }
        scanner.close();

        long walkCost = A;
        long tpCost = B;

        long totalCost = 0;
        for (int i = 0; i < N - 1; i++) {
            long current = X[i];
            // 次への移動、walk と tp どっちがいいか
            long next = X[i + 1];
            long walk = (next - current) * walkCost;
            totalCost += Math.min(walk, tpCost);
        }

        System.out.println(totalCost);
    }
}
