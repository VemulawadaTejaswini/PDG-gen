import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int K = sc.nextInt();

        int ans = 1;
        for (int i = 0; i < N; i++) {
            ans = Math.min(ans *  2, ans + K);
        }
        System.out.println(ans);
    }
}
