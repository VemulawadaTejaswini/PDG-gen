import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());

        if (N % 2 != 0) {
            System.out.println(0);
            return;
        }

        long ans = 0;
        while (N > 0) {
            ans += N /= 10;
        }

        System.out.println(ans);
    }
}
