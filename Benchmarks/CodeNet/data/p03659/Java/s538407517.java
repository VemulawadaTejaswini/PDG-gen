import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    /**
     * 本処理を実行します。
     */
    public static void execute() {

        int n = nextInt();
        int[] a = nextInts(n);
        int aLength = a.length;

        int result;
        if (aLength == 2) {
            result = Math.abs(a[0] - a[1]);
        } else {

            /*
             * 最後の数値を保持し、それを超えるところまで総和を求める
             * その総和と、それ以降の総和の絶対値が解
             */
            int lastNum = a[aLength - 1];
            int firstNum = a[0];
            int tmp = 0;
            int tmp2 = 0;
            int parseIndex;

            if (firstNum > lastNum) {
                tmp = lastNum;
                parseIndex = 0;
                for (int i = aLength - 2; i > 0; i--) {
                    tmp += a[i];
                    if (tmp > firstNum) {
                        parseIndex = i - 1;
                        break;
                    }
                }

                for (int i = parseIndex; i >= 0; i--) {
                    tmp2 += a[i];
                }
            } else {
                // 最初のが小さいか同じ
                tmp = firstNum;
                parseIndex = aLength - 1;
                for (int i = 1; i < aLength - 1; i++) {
                    tmp += a[i];
                    if (tmp > lastNum) {
                        parseIndex = i + 2;
                        break;
                    }
                }

                for (int i = parseIndex; i < aLength; i++) {
                    tmp2 += a[i];
                }
            }

            result = Math.abs(tmp - tmp2);
        }

        out(result);
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