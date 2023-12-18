import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        String a = nextString();
        int start = 0;
        int pattern = 1;        // 何もしないがあるので1は確定

        while (start < a.length() - 1) {
            for (int i = start + 1; i < a.length(); i++) {
                String sub = a.substring(start, i + 1);
                String reverseSub = reverse(sub);

                if (reverseSub.equals(sub)) {
                    continue;
                } else {
                    pattern++;
                }
            }

            start++;
        }

        out(pattern);
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = s.length() - 1 ; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
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