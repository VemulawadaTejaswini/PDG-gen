import java.util.Scanner;
import java.util.Arrays;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] key = new int[N];
        int[] L = new int[M];
        int[] R = new int[M];

        for (int i = 0; i < M; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        Arrays.sort(R);
        Arrays.sort(L);

        System.out.println(R[M - 1] - L[0]);

        sc.close();

    }
}