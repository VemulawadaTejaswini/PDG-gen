import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }

        scanner.close();

        int ans = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            int cost = 0;
            for (int x : A) {
                cost += (x - i) * (x - i);
            }
            ans = Math.min(ans, cost);
        }
        System.out.println(ans);
    }
}
