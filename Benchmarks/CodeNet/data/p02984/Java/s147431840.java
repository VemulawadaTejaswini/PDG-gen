import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = solve2(N, A);
        for (int i=0; i<N; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    private static int[] solve2(int N, int[] A) {
        int[] ans = assume(N, A, 0);
        int value = valid(N, A, ans);

        if (value != 0) {
            ans = assume(N, A, -value);
        }

        return ans;
    }

    private static int[] assume(int N, int[] A, int a) {
        int[] ans = new int[N];
        ans[0] = a;
        for (int i=1; i<N; i++) {
            ans[i] = (A[i-1] - ans[i-1]/2)*2;
        }

        return ans;
    }

    private static int valid(int N, int[] A, int[] ans) {
        return ans[0]/2 + ans[N-1]/2 - A[N-1];
    }

}
