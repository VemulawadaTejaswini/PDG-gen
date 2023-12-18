import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = a[0];

        for (int i = 1; i < n; i++) {
            ans = gcd(ans, a[i]);
        }

        sc.close();

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return gcd(b % a, a);
        }
    }
}