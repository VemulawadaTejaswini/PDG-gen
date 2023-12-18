import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        for (int i = 0; i < N; ++i) a[i] = Integer.parseInt(sc.next());
        for (int i = 0; i < N; ++i) b[i] = Integer.parseInt(sc.next());
        for (int i = 0; i < N; ++i) c[i] = Integer.parseInt(sc.next());
        Arrays.sort(a);
        Arrays.sort(c);

        long res = 0;
        for (int i = 0; i < N; ++i) {
            int key = b[i];
            int left = -1;
            int right = N;
            while (right - left > 1) {
                int mid = (right + left) / 2;
                if (key <= a[mid]) right = mid;
                else left = mid;
            }
            long tmpA = right;

            left = -1;
            right = N;
            while (right - left > 1) {
                int mid = (right + left) / 2;
                if (key < c[mid]) right = mid;
                else left = mid;
            }
            long tmpB = N - right;

            res += tmpA * tmpB;
        }

        System.out.println(res);
    }
}