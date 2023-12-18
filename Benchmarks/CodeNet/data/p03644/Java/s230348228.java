import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;

        while (n > 0) {
            n /= 2;
            ans += 1;
        }

        System.out.println(1<<ans);
    }
}