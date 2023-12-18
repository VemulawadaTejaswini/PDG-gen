import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println( solve(N, K, X, Y) );
    }

    private static int solve(int N, int K, int X, int Y) {
        if( N > K ) {
            return K * X + (N - K) * Y;
        } else {
            return N * X;
        }
    }
}