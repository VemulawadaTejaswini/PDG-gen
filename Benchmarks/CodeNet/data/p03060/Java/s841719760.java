import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] V = new int[N], C = new int[N];
        int max = 0;

        for (int i = 0; i < N; i ++) {
            V[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i ++) {
            C[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i ++) {
            if (V[i] - C[i] > 0) max += V[i] - C[i];
        }

        System.out.println(max);

    }
}
