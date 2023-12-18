import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int walkCost = A;
        int tpCost = B;

        int totalCost = 0;
        for (int i = 0; i < N - 1; i++) {
            int current = X[i];
            // 次への移動、walk と tp どっちがいいか
            int next = X[i + 1];
            int walk = (next - current) * walkCost;
            totalCost += Math.min(walk, tpCost);
        }

        System.out.println(totalCost);
    }
}
