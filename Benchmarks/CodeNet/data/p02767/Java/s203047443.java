import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);

        int min = 1_000_000_000;
        for (int p = 1; p <= 100; p++) {
            int tmp = 0;
            for (int i = 0; i < N; i++) {
                tmp += (X[i]-p)*(X[i]-p);
            }
            min = Math.min(min, tmp);
        }

        System.out.println(min);
    }
}

