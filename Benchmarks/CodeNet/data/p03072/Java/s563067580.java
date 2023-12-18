import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }

        int first = H[0];
        int[] extH = Arrays.copyOfRange(H, 1, N);

        int viewCnt = 1;
        int max = first;
        for (int i : extH) {
            max = Math.max(i, max);
            if (i >= max) {
                viewCnt++;
            }
        }

        System.out.println(viewCnt);
    }
}
