import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int ans = solve(N, D, X, a);
        System.out.println(ans);
    }

    private static int solve(int N, int D, int X, int[] a) {
        int total = X;

        for (int i=0; i<N; i++) {
//            System.err.print((D-1)/a[i] + " ");
            total += 1 + (D-1)/a[i];
        }

        return total;
    }
}