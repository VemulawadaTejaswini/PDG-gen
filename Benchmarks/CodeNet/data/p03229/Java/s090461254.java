
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = scanner.nextInt();

        Arrays.sort(A);

        int halfSize = N / 2 + (N % 2 != 0 ? 1 : 0);
        int[] smaller = new int[halfSize];
        int[] larger = new int[halfSize];

        for (int i = 0; i < halfSize; i++) {
            smaller[i] = A[i];
            larger[i] = A[(N - 1) - i];
        }

        int smallerLastIndex = N == 3 ? 1 : halfSize - (N % 2 == 0 ? 1 : 2);
        int smallerMin = smaller[0];
        int smallerMax = smaller[smallerLastIndex];
        smaller[0] = smallerMax;
        smaller[smallerLastIndex] = smallerMin;

        int ans = 0;
        for (int i = 0; i < halfSize; i++) {
            int additional = Math.abs(larger[i] - smaller[i]);
            // System.out.println(additional);
            ans += additional;
            if (i + 1 < halfSize) {
                int additionalSecond = Math.abs(larger[i] - smaller[i + 1]);
                // System.out.println(additionalSecond);
                ans += additionalSecond;
            }
        }
        System.out.println(ans);
    }

}
