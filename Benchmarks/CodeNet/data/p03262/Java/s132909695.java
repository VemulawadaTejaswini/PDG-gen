import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = Math.abs(temp - x);
        }
        int ans = a[0];
        for (int i = 1; i < n - 1; i++) {
            ans = getGcd(ans, a[i]);
        }
        System.out.println(ans);
    }

    private static int getGcd(int x, int y) {
        return y == 0 ? x : getGcd(y, x % y);
    }
}