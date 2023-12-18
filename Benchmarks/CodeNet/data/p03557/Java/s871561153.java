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

    private static int solve(int N, int[] as, int[] bs, int[] cs) {
        Arrays.sort(as);
        Arrays.sort(bs);
        Arrays.sort(cs);

        int[] counts_b = new int[N];
        for (int i = N -1; i >= 0; i--) {
            int b = bs[i];
            int result = Arrays.binarySearch(cs, b);

            if( result >= 0 ) {
                // bs[i] == cs[result] のケース
                // cs[result+1]以降が可能性のある組み合わせ
                int count = N - (result + 1);
                if( count < 0 ) count = 0;
                counts_b[i] = count;

            } else {
                // bs[i] < cs[index] のケース
                int index = ~result;
                int count = N - index;
                counts_b[i] = count;
            }

            // 右のものを足して累積和にしておく
            if( i != N - 1 ) {
                counts_b[i] += counts_b[i+1];
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = as[i];
            int result = Arrays.binarySearch(bs, a);

            if( result >= 0 ) {
                // a[i] == b[result]のケース
                // result + 1に入ってる累積和を追加する
                // 境界に注意する
                if( result + 1 < N ) {
                    sum += counts_b[result+1];
                }

            } else {
                // a[i] < b[index]のケース
                int index = ~result;
                if( index < N ) {
                    sum += counts_b[index];
                }
            }
        }

        return sum;
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int i : array) {
            j.add("" + i);
        }
        System.err.println( j.toString() );
    }

    private static int sum(int[] array, int from) {
        int sum = 0;
        for (int i = from; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
