import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            boolean hh = false;
            boolean ww = false;
            if (h <= a[i]) {
                hh = true;
            }
            if (w <= b[i]) {
                ww = true;
            }
            if (hh && ww) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}