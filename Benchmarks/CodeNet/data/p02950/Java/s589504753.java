import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int P = in.nextInt();
        int[] A = new int[P];
        int[] B = new int[P];

        for (int i = 0; i < P; i++) {
            A[i] = in.nextInt();
        }

        B[0] = A[0];
        
        for (int i = 1; i < P; i++) {
            B[P - 1] = (B[P - 1] + A[i] - B[0] + P) % P;
        }
        B[P - 1] = (P - B[P - 1]) % P;

        for (int i = P - 2; 0 < i; i--) {
            for (int j = 1; j < P; j++) {
                A[j] = (A[j] * j) % P;
                B[i] = (B[i] + A[j]) % P;
            }
            B[i] = (P - B[i]) % P;
        }
        
        out.println(Arrays.toString(B));
    }
}
