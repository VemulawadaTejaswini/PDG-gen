import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if ( n == 0 ) {
                break;
            }

            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            int avg = sum / n;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if ( a[i] <= avg ) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

