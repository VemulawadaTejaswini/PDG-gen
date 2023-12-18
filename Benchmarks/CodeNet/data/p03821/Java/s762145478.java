import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            while ((a[n - i - 1] + ans) % b[n - i - 1] > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}