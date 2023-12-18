import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//            while (true)
                solve(in);
        }
    }
 
    private static void solve(Scanner in) {
        int N = in.nextInt();
        int[] A = new int[N];
 
        int maxi = 0;
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            maxi = A[maxi] > A[i] ? maxi : i;
        }
 
        while (A[maxi] != 0) {
//            System.out.println(Arrays.toString(A) + " " + maxi);
            int nexi = (maxi + 1) % N;
            for (int j = 1; j < N + 1; j++) {
                int k = (maxi + j) % N;
                A[k] -= j;
                nexi = A[nexi] > A[k] ? nexi : k;
            }
            maxi = nexi;
        }
 
//        System.out.println(Arrays.toString(A));
 
        boolean ans = true;
        for (int i = 0; i < N; i++) {
            if (A[i] != 0) {
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "YES" : "NO");
    }
}