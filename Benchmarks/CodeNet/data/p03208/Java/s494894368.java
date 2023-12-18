import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);

        System.out.println(Math.min(list[K - 1] - list[0], list[N - 1] - list[N - 1 - K - 1]));
    }
}