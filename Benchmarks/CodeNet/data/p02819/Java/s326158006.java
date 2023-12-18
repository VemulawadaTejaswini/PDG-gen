import java.util.Scanner;

public class Main {

    static boolean normal(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int x = std.nextInt();
        int ans;
        if (normal(x)) {
            ans = x;
        } else {
            while (!normal(x)) {
                x++;
            }
            ans = x;
        }

        System.out.println(ans);
    }
}
