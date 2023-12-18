import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i= 0;i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++) {
            b[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n ; i++) {
            if (b[i] >= a[i]) {
                ans += a[i];
                int sabun = b[i] - a[i];
                if (sabun >= a[i+1]) {
                    ans += a[i+1];
                    a[i+1] = 0;
                } else {
                    ans += sabun;
                    a[i+1] -= sabun;
                }
            } else {
                ans += b[i];
            }
        }
        System.out.println(ans);
    }
}
