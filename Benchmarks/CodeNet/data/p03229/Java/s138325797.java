import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(A);
        int sum = 0;
        int left = A[0];
        int right = A[0];
        int minIndex = 1;
        int maxIndex = N - 1;
        for (int i = 1; i < N; i++) {
            if ((((i - 1) / 2) % 2) == 0) {
                // left, right is small.
                if (i % 2 == 0) {
                    // compare with right (second).
                    int nextRight = A[maxIndex];
                    sum += (nextRight - right);
                    maxIndex--;
                    right = nextRight;
                } else {
                    // compare with left (first).
                    int nextLeft = A[maxIndex];
                    sum += (nextLeft - left);
                    maxIndex--;
                    left = nextLeft;
                }
            } else {
                // left, right is big.
                if (i % 2 == 0) {
                    // compare with right (second).
                    int nextRight = A[minIndex];
                    sum += (right - nextRight);
                    minIndex++;
                    right = nextRight;
                } else {
                    // compare with left (first).
                    int nextLeft = A[minIndex];
                    sum += (left - nextLeft);
                    minIndex++;
                    left = nextLeft;
                }
            }
        }
        System.out.println(sum);
    }
}
