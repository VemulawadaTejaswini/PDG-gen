import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int mx = Math.max(n, m);
        int mn = Math.min(n, m);

        if (mx == 1) {
            System.out.println(0);
        } else if (mn == 1) {
            System.out.println(mx - 2);
        } else {
            int ans = (mx - 2) * (mn - 2);
            System.out.println(ans);
        }
    }
}