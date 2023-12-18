import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < N; ++i) {
            while (i + 1 < N && A[i] == A[i + 1]) {
                ++i;
            }
            if (i + 1 < N && A[i] < A[i + 1]) {
                while (i + 1 < N && A[i] <= A[i + 1]) {
                    ++i;
                }
            } else if (i + 1 < N && A[i] > A[i + 1]) {
                while (i + 1 < N && A[i] >= A[i + 1]) {
                    ++i;
                }
            }
            ++ans;
        }

        System.out.println(ans);
    }
}