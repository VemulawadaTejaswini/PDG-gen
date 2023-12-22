import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] H = new long[N];
        int[] A = new int[M];
        int[] B = new int[M];
        boolean[] isGood = new boolean[N + 1];
        Arrays.fill(isGood, true);
        int ans = N;

        for (int i = 0; i < H.length; i++) {
            H[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            if ((H[A[i] - 1] > H[B[i] - 1]) && (isGood[B[i] - 1])) {
                ans--;
                isGood[B[i] - 1] = false;
                continue;
            }
            if ((H[A[i] - 1] < H[B[i] - 1]) && (isGood[A[i] - 1])) {
                ans--;
                isGood[A[i] - 1] = false;
            }
            if ((H[A[i] - 1] == H[B[i] - 1])) {
                if (isGood[A[i] - 1]) {
                    ans--;
                    isGood[A[i] - 1] = false;
                }
                if (isGood[B[i] - 1]) {
                    ans--;
                    isGood[B[i] - 1] = false;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}