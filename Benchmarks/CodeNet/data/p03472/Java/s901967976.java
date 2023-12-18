import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        while (h > 0) {
            for (int i = n - 1; i >= 0; i--) {
                if (b[i] > a[n - 1]) {
                    h -= b[i];
                    ans++;
                }
            }
            if (h % a[n - 1] == 0)
                ans += h / a[n - 1];
            else if (h % a[n - 1] != 0)
                ans += h / a[n - 1] + 1;
        }
        System.out.println(ans);
        sc.close();
    }
}