import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(sc.next());
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