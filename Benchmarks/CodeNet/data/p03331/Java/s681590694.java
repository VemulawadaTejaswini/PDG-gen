import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        int n = N;
        int ans = 0;
        for (int i = 0; i <= String.valueOf(N).length(); i++) {
            ans += n % 10;
            n /= 10;
        }

        if (ans == 1 && String.valueOf(N).length() > 1) {
            System.out.println(10);
        } else {
            System.out.println(ans);
        }
    }
}
