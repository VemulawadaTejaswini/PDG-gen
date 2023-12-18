import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[M];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        if (x[N - 1] >= y[0]) {
            System.out.println("War");
            return;
        }

        if (y[0] <= X) {
            System.out.println("War");
            return;
        }

        if (x[N-1] >= Y) {
            System.out.println("War");
            return;
        }

        System.out.println("No War");
    }
}