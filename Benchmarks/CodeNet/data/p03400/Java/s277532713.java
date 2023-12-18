import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        int D = Integer.parseInt(scanner.next());
        int X = Integer.parseInt(scanner.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int eatenCount = 0;
        for (int i = 1; i <= D; i++) {
            for (int j = 0; j < N; j++) {
                if (A[j] == 1 || i % A[j] == 1) {
                    eatenCount++;
                }
            }
        }

        System.out.println(X + eatenCount);
    }
}
