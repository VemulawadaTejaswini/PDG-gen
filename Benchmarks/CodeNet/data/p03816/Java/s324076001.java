import java.util.*;

public class Main {

    private static int N;
    private static int A[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    static long solve() {
        Arrays.sort(A);
        int k = 0;
        int prev = -1;
        for (int i = 0; i < N; i++) {
            if( prev != A[i] ) {
                k++;
                prev = A[i];
            }
        }

        // Nは奇数+二枚づつ削る、なので
        // カードの種類が
        //   奇数 -> うまく削れる
        //   偶数 -> 一つ余計に削る
        if( k % 2 == 1 ) {
            return k;
        } else {
            return k - 1;
        }
    }
}
