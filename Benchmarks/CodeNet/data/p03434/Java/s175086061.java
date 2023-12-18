import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int A[] = new int[N];
        for (int a = 0; a < N; ++a) {
            A[a] = sc.nextInt();
        }

        Arrays.sort(A);

        int alice = 0;
        int bob=0;
        for (int i=0; i < N; i++) {
            if (i%2 == 0) {
                alice += A[N-1-i];
            } else {
                bob += A[N-1-i];
            }
        }
        System.out.println(alice - bob);
    }
}
