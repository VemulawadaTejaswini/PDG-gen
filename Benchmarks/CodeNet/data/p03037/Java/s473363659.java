import java.util.*;

public class Main {

    private static int N;
    private static int M;
    private static int[] L;
    private static int[] R;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        L = new int[M]; R = new int[M];
        for (int i = 0; i < M; i += 1) {
            L[i] = Integer.parseInt(sc.next());
            R[i] = Integer.parseInt(sc.next());
        }
    }

    public static void main(String[] args) {
        read();

        int maxL = Integer.MIN_VALUE;
        int minR = Integer.MAX_VALUE;
        for (int i = 0; i < M; i += 1) {
            if (maxL < L[i]) {
                maxL = L[i];
            }
            if (minR > R[i]) {
                minR = R[i];
            }
        }

        System.out.println(minR - maxL + 1);
    }
}
