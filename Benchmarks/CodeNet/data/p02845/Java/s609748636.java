import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        long ans = 1;
        long mod = 1000000007;
        int[] b = new int[3];
        for (int i = 0 ; i < n ; i++) {
            int c = 0;
            for (int j = 0 ; j < 3 ; j++) {
                if (a[i] == b[j]) {
                    c++;
                    if (c == 1) b[j]++;
                }

            }
            ans *= (long) c;
            ans %= mod;

        }

        System.out.println(ans);

    }

}