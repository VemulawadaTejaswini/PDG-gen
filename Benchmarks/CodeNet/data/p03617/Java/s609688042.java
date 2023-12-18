import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        int l025 = nextInt();
        int l05 = nextInt();
        int l1 = nextInt();
        int l2 = nextInt();

        long n = nextInt();

        if (n == 1) {
            // 全部1Lの値段にする。
            int l025_1 = l025 * 4;
            int l05_1 = l05 * 2;

            // 一番安い奴つかう
            long[] parr1l = new long[] {l025_1, l05_1, l1};
            Arrays.sort(parr1l);

            out(parr1l[0]);

            return;

        } else if (n % 2 == 0) {
            // 全部2L値段にスル
            long l025_2 = l025 * 8L;
            long l05_2 = l05 * 4L;
            long l1_2 = l1 * 2L;

            // 一番安い奴つかう
            long[] parr = new long[] {l025_2, l05_2, l1_2, l2};
            Arrays.sort(parr);

            out(parr[0] * (n / 2));

            return;

        } else {
            // 全部2L値段にスル
            long l025_2 = l025 * 8L;
            long l05_2 = l05 * 4L;
            long l1_2 = l1 * 2L;

            // 一番安い奴つかう
            long[] parr = new long[] {l025_2, l05_2, l1_2, l2};
            Arrays.sort(parr);

            // 1L値段も
            long l025_1 = l025 * 4L;
            long l05_1 = l05 * 2L;

            // 一番安い奴つかう
            long[] parr1l = new long[] {l025_1, l05_1, l1};
            Arrays.sort(parr1l);


            out((parr[0] * (n / 2)) + parr1l[0]);

            return;
        }
    }

    /**
     * 次の標準入力をintで受け取ります。
     * @return 標準入力値(int)
     */
    public static int nextInt() {
        return sc.nextInt();
    }

    /**
     * 次の標準入力をStringで受け取ります。
     * @return 標準入力値(String)
     */
    public static String nextString() {
        return sc.next();
    }

    /**
     * 次の標準入力を指定回数分intで受け取ります。
     * @param n 取得回数
     * @return 取得した標準入力値の配列(int)
     */
    public static int[] nextInts(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        return arr;
    }

    /**
     * 標準出力にオブジェクトを出力します。
     * @param o 出力対象
     */
    public static void out(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        execute();
    }
}