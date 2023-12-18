import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;
        if (d == 0) {
            ans = n;
        } else if (d == 1) {
            ans = 100 * n;
        } else {
            ans = 10000 * n;
        }

        System.out.println(ans);
    }
}
