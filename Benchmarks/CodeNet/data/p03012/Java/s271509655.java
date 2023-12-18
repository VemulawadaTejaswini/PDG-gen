import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            sum+= a[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            int s1 = 0;
            for (int j = 0; j < i; j++) {
                s1 += a[j];
            }
            int s2 = sum - s1;
            ans = Math.min(ans, Math.abs(s1 - s2));
        }
        System.out.println(ans);
    }
}
