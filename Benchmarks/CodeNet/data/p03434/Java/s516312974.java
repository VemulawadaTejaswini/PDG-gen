import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int A[] = new int[N];
        for (int a = 0; a < N; a++) {
            A[a] = sc.nextInt();
        }

        Arrays.sort(A);

        int res = 0;
        for (int i=0; i < N-1; i++) {
            res += (A[N-i-1] - A[N-i-2]);
        }
        System.out.println(res);
    }
}
