import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int invert = 0;
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
            if (A[i] > B[i]) invert++;
        }
        if (invert >= N - 1) {
            System.out.println("No");
            return;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            if (A[i] > B[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
