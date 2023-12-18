import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        Arrays.setAll(A, i -> sc.nextInt());
        Arrays.sort(A);
        for(int i = 1; i < A.length; i++)
            if(A[i] == A[i - 1]) {
                System.out.println("NO");
                return;
            }
        System.out.println("YES");
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
