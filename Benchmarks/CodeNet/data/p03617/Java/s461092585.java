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
            // 0.25２個と0.5どっちがやすい
            int l025_2 = l025 * 2;
            int price1 = l05;

            if (l025_2 < l05) {
                price1 = l025;
            }

            int price1_2 = price1 * 2;
            if (price1_2 < l1) {
                out(price1_2);
            } else {
                out(l1);
            }

            return;

        } else if (n % 2 == 0) {
            out(l2 * (n / 2));
        } else {
            out((l2 * (n / 2)) + l1);
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