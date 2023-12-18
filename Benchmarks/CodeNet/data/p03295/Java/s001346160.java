import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m], b = new int[m];
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            arr[a[i]]++;
            arr[b[i]]--;
        }

        int ans = 0;
        while (true) {
            int now = 0;
            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < n; i++) {
                now += arr[i];
                if (now > max) {
                    max = now;
                    maxIndex = i;
                }
            }

            //System.out.println(Arrays.toString(arr)+" "+maxIndex);
            if (max == 0) {
                System.out.println(ans);
                return;
            }
            ans++;
            for (int i = 0; i < m; i++) {
                if (a[i] <= maxIndex && b[i] > maxIndex) {
                    arr[a[i]]--;
                    arr[b[i]]++;
                    a[i] = Integer.MAX_VALUE;
                    b[i] = Integer.MAX_VALUE;
                }
            }
        }
    }
}
