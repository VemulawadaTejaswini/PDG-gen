import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int cnt = 0;
        int ans = 0;
        for (int i = 1; i <= a[n - 1]; i++) {
            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] % i != 0) {
                    cnt++;
                }
                if (cnt > 1) {
                    break;
                }
                if (j == n - 1) {
                    ans = i;
                }

            }
        }
        System.out.println(ans);

        sc.close();
    }
}