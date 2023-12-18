import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int first = 1;
        for (int i = 0; i < n; i++) {
            if (d[i] != 0) {
                first = d[i];
                break;
            }
        }

        long ans = 1;
        for (int i = 0; i < n; i++) {
            if (d[i] == 0) {
                continue;
            }

            ans *= d[i];
            ans %= 998244353;
            // System.out.printf("%s -> %s \n", i, ans);
        }

        if (d[0] != 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}
