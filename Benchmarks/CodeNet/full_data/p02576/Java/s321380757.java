import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int T = in.nextInt();
        int ans = snack(N, X, T);
        System.out.println(ans);

    }

    // 20, 12, 6
    public static int snack(int N, int X, int T) {
        int x = X;
        int t = T;
        for (; x < N; x = x + X) {
            t = t + T;
        }
        return t;
    }
}
