import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i = 0; i < n + 1; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        int ans = 0;
        for (int j = 0; j < n; j++) {
            int x = Math.min(a[j + 1], b[j]);
            b[j] -= x;
            ans += x;
            int y = Math.min(a[j], b[j]);
            b[j] -= y;
            ans += y;
        }
        System.out.println(ans);
    }
}