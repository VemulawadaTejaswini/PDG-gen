import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N;
    static int[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        solve();
    }

    public static void solve() {

        int count = 0;
        int sum = 0;
        int right = 0;
        for (int left = 0; left < N; left++) {

            while (right < N && (sum ^ A[right]) == sum + A[right]) {
                sum += A[right];
                right++;
            }

            count += right - left;

            if (left == right) {
                right++;
            } else {
                sum -= A[left];
            }
        }

        System.out.println(count);
    }

}
