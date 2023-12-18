import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        int x = sc.nextInt();

        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        if (Arrays.stream(A).sum() == x) {
            System.out.println(N);
            return;
        }

        Arrays.sort(A);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (x >= A[i]) {
                ans++;
                x -= A[i];
            } else {
                break;
            }
        }

        if (x > 0) ans--;

        System.out.println(ans);
    }
}
