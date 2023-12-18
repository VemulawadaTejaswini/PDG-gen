import java.util.*;

class Main {

    static int upper_bound(int a[], int key) {
        int left = 0;
        int right = a.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if ( key < a[mid] ) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    static int lower_bound(int a[], int key) {
        int left = 0;
        int right = a.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if ( key <= a[mid] ) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        // A cumulative summation.
        int[] AS = new int[N + 1];
        AS[0] = 0;
        for (int i = 0; i < N; i++) {
            AS[i + 1] = AS[i] + A[i];
        }

        int left = 0;
        int right = Integer.MAX_VALUE/2;

        long cnt = 0;
        long sum = 0;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            final int h = mid;
            cnt = 0;
            sum = 0; // sum of happiness
            //System.out.println(String.format("==== count a pattern is %d or not. ===", mid));
            // a : a target of a handshake with his left hand.
            for (int a : A) {
                // count a number of combinations which is larger equal than H.
                int i = lower_bound(A, h - a);
                int nr_hs = N - i; // nr_handshakes.
                cnt += nr_hs;
                sum += (AS[N] - AS[i]) /* w/right hand */
                        + a * nr_hs /* w/left hand*/ ;
            }
            if (cnt >= M) {
                left = mid;
            } else {
                right = mid;
            }
        }
        // sum : MAX happiness when nr_handshakes is cnt.
        // cnt - M: diff between nr_handshakes and M. minus means cnt < M.
        // if cnt > M, nr_handshakes is larger than M.
        // The max happiness is left, so it should be decremented.
        System.out.println(sum - (cnt - M) * left);
    }
}
