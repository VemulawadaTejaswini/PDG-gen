import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] a = new int[3*N];
        for (int i = 0; i < 3*N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += a[3*N-3-i];
        }

        System.out.println(ans);
    }
}
