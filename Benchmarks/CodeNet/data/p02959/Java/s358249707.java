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
        long ans = 0;
        for (int j = 0; j < n; j++) {
            int x = Math.min(a[j], b[j]);
            ans += x;
            b[j] -= x;
            int y = Math.min(a[j + 1], b[j]);
            ans += y;
            a[j + 1] -= y;
        }
        System.out.println(ans);
    }
}