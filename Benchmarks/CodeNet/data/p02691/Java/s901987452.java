import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs((i + 1) - (j + 1)) == a[i] + a[j]) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}
