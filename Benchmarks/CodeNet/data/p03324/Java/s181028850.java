import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;
        if (n == 0) {
            for (int i = 1; i <= n; i++) {
                ans = i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                ans = (int)Math.pow(100, d) * i;
            }
        }

        System.out.println(ans);
    }
}
