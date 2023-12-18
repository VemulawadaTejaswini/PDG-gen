import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[2 * N - 1];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        int[] tmp = new int[2 * N - 1];
        int M = 2 * N - 1;
        for (int i = 0; i < N; ++i, M -= 2) {
            for (int j = i + 1; j < M - i - 1; ++j) {
                tmp[j] = mid(a[j - 1], a[j], a[j + 1]);
            }
        }
        System.out.println(tmp[N - 1]);
    }
    private static int mid(int a1, int a2, int a3) {
        if (a1 <= a2 && a2 <= a3) {
            return a2;
        } else if (a2 <= a1 && a1 <= a3) {
            return a1;
        } else {
            return a3;
        }
    }
}