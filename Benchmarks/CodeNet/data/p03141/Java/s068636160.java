import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = a[i] + b[i];
        }
        Arrays.sort(c);
        boolean aturn = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = a[j] + b[j];
                if (num == c[n - 1 - i]) {
                    if (aturn) {
                        ans += a[j];
                        aturn = false;
                        break;
                    } else {
                        ans -= b[j];
                        aturn = true;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
