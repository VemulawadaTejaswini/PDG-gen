import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == -1) {
                continue;
            }
            int cur = a[i];
            a[i] = -1;
            for (int j = i+1; j < n; j++) {
                if (cur < a[j]){
                    cur = a[j];
                    a[j] = -1;
                }
            }
            ans++;
        }
        System.out.println(ans);

    }
}
