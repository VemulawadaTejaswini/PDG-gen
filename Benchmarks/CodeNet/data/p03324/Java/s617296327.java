import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;
        if (d == 0) {
            ans = n;
        } else {
            for (int i = 1; i <= n; i++) {
                ans = (int)Math.pow(100, d) * i;
            }
        }

        System.out.println(ans);
    }
}
