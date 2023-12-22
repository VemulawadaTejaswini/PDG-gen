import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long ans = 1;
        for (int i = 0; i < N ;i++) {
            ans *= sc.nextLong();
        }
        if ( ans > 1000000000000000000L) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }
}
