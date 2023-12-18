import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int ans = 0;
        int even = v[0];
        int odd = v[1];
        if (even == odd) {
            odd++;
            ans++;
        }
        for (int i = 2; i < n; i += 2) {
            if (even != v[i])
                ans++;
        }
        for (int i = 3; i < n; i += 2) {
            if (odd != v[i])
                ans++;
        }
        System.out.println(ans);
    }
}
