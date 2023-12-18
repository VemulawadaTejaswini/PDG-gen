import java.util.Scanner;

public class Main {
    static int N;
    static int[] w;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        w = new int[N];
        for(int i = 0; i < N; i++) {
            w[i] = scanner.nextInt();
        }

        scanner.close();

        int ans = Integer.MAX_VALUE;
        int s1 = 0;
        for(int i = 0; i < N - 1; i++) {
            int s2 = 0;
            for(int j = N - 1; i + 1 <= j; j--) {
                s2 += w[j];
            }
            s1 += w[i];
            ans = Math.min(ans, Math.abs(s1 - s2));
        }

        System.out.println(ans);
    }
}