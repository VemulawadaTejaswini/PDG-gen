import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        final int[] B = new int[N];
        for (int i = 0; i < N; i++)
            B[i] = sc.nextInt();
        Arrays.sort(A);
        Arrays.sort(B);
        boolean ok = true;
        for (int i = 0; i < N; i++)
            ok &= A[i] <= B[i];
        System.out.println(ok ? "Yes" : "No");
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}
