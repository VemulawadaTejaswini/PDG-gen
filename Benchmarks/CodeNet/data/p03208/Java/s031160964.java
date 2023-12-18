import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(minimalDistance(A, K));
    }

    private static int minimalDistance(int[] a, int k) {
        Arrays.sort(a);
        int low = Integer.MAX_VALUE;
        for (int i = 0; i <= a.length - k; i++) {
            if (low > (a[i + k - 1] - a[i])) {
                low = a[i + k - 1] - a[i];
            }
        }
        return low;
    }
}