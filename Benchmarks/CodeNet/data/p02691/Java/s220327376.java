import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for(int j = 0; j < n - a[i]; j++) {
                if (i - j == a[j] + a[i]) ans++;
            }
        }

        System.out.println(ans);
    }
}