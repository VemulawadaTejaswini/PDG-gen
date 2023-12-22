import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] p = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = sc.nextInt();
            }
            Arrays.sort(p);
            int sum = 0;
            for (int k = 0; k < K; k++) {
                sum += p[k];
            }
            System.out.println(sum);
        }
    }
}
