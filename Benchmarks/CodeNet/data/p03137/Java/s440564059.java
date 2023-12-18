import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N >= M) {
            System.out.println(0);
            System.exit(0);
        }
        int[] X = new int[M];
        for (int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        int[] dif = new int[M - 1];
        for (int i = 0; i < X.length - 1; i++) {
            dif[i] = X[i + 1] - X[i];
        }
        Arrays.sort(dif);
        int res = X[M - 1] - X[0];
        for (int i = 0; i < N - 1; i++) {
            res -= dif[M - 2 - i];
        }
        System.out.println(res);
        sc.close();
    }
}