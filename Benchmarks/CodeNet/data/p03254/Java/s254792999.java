import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int ret = 0;
        for (int i = 0; i < N; i++) {
            if (x - A[i] >= 0 && i < N - 1) {
                x -= A[i];
                ret++;
            } else if (i == N - 1 && x == A[N - 1]) {
                ret++;
            } else {
                break;
            }
        }

        System.out.println(ret);
    }
}