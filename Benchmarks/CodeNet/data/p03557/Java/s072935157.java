import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] as = new int[N];
        for (int i = 0; i < N; i++) {
            as[i] = sc.nextInt();
        }
        int[] bs = new int[N];
        for (int i = 0; i < N; i++) {
            bs[i] = sc.nextInt();
        }
        int[] cs = new int[N];
        for (int i = 0; i < N; i++) {
            cs[i] = sc.nextInt();
        }

        System.out.println( solve(N, as, bs, cs) );
    }

    private static long solve(int N, int[] as, int[] bs, int[] cs) {
        Arrays.sort(as);
        Arrays.sort(bs);
        Arrays.sort(cs);

        long[] counts_b = new long[N];
        for (int i = N-1; i >= 0; i--) {
            int b = bs[i];

            int index = upperBound(cs, b);
            int count = N - index;
            counts_b[i] = count;
            // 右のものを足して累積和にしておく
            if( i != N - 1 ) {
                counts_b[i] += counts_b[i+1];
            }
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            int a = as[i];
            int index = upperBound(bs, a);

            if( index < N ) {
                sum += counts_b[index];
            }
        }

        return sum;
    }

    private static int upperBound(int[] array, int value) {
        int low = 0;
        int high = array.length;
        int mid;
        while( low < high ) {
            mid = ((high - low) >>> 1) + low; // (high + low) / 2
            if( array[mid] <= value ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int i : array) {
            j.add("" + i);
        }
        System.err.println( j.toString() );
    }
}