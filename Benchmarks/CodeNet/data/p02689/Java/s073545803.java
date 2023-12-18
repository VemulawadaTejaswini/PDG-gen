import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }
        int[] t = new int[N];
        for (int i = 0; i < M; i++) {
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            t[A - 1] = max(t[A - 1], H[B - 1]);
            t[B - 1] = max(t[B - 1], H[A - 1]);
        }
        int result = 0;

        for (int i = 0;i < N; i++) {
            if (H[i] > t[i]) {
                result += 1;
            }

        }

        System.out.print(result);

    }
}