import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            if ((i + 1) % 2 != 0 && temp % 2 != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}