import java.util.Scanner;

public class Main {
    private static int sum(int x) {
        int ans = 0;
        for (; x > 0; x /= 10) {
            ans += (x % 10);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;

        for (int i=1; i<N; i++) {
            int A = i;
            int B = N - A;

            int sumOfAB = sum(A) + sum(B);
            if (sumOfAB < ans) {
                ans = sumOfAB;
            }
        }

        System.out.println("" + ans);
    }
}
