import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i = 1; i < N; i++) {
            int boss = scanner.nextInt();
            A[boss - 1]++;
        }
        for(int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }

        return;
    }
}
