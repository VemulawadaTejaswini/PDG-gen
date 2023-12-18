import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = solve(N, A);
        for (int i=0; i<N; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    private static int[] solve(int N, int[] A) {
        int[] ans = null;

        int minA = 0, minValid = 0;
        int maxA = A[0]*2, maxValid = 0;

        if ((minValid = valid(N, A, assume(N, A, minA))) == 0) {
            return assume(N, A, minA);
        }
        if ((maxValid = valid(N, A, assume(N, A, maxA))) == 0) {
            return assume(N, A, maxA);
        }
        while (true) {
            int midA = (minA+maxA)/2;
            if (midA%2 == 1) midA+=1;

            ans = assume(N, A, midA);
            int value = valid(N, A, ans);
            if (value == 0) break;
            if (value > 0) {
                maxA = midA;
            } else {
                minA = midA;
            }
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
