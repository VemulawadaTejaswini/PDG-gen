import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] difference_a = new int [N];
        for (int i = 0; i < N; i++) {
            difference_a[i] = a[i];
            difference_a[i] -= i + 1;
        }
        Arrays.sort(difference_a);
        int d = (N + 2 - 1) / 2;
        int b = difference_a[d - 1] - 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.abs(a[i] - (i + 1 + b));
        }
        System.out.println(ans);
    }
}