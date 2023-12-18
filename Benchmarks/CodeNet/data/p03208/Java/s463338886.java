import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        int ans = 1000000000;
        for (int i = 0; i < N-K+1; i++) {
            ans = Math.min(ans, h[i+K-1] - h[i]);
        }

        System.out.println(ans);
    }
}
