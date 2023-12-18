import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final char[] A = sc.next().toCharArray();
        final char[] B = sc.next().toCharArray();
        final char[] C = sc.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i] || B[i] == C[i] || C[i] == A[i]) {
                if (A[i] != B[i] || B[i] != C[i])
                    ans++;
            } else
                ans += 2;
        }
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
