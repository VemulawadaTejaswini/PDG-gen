import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        Scanner sc = new Scanner(System.in);

        int n = nextInt(sc);    // 山札の枚数
        int z = nextInt(sc);    // 初期手札Xさん
        int w = nextInt(sc);     // 初期手札Yさん
        int[] a = new int[n];

        int maxIndex = 0;
        int maxValue = 0;
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;

        // 大きい場所と値保持
        for (int i = 0;i < n; i++) {
            a[i] = nextInt(sc);

            if (a[i] >= maxValue) {
                maxIndex = i;
                maxValue = a[i];
            }

            if (a[i] <= minValue) {
                minIndex = i;
                minValue = a[i];
            }
        }

        // Xさんとyさん
        Player x_san = new Player(z);
        Player y_san = new Player(w);

        // どちらが相手より大きいか
        if (x_san.hand >= y_san.hand) {
            x_san.isBigHand = true;
        } else {
            y_san.isBigHand = true;
        }

        // 場の全部より大きいかX
        if (x_san.hand >= maxValue) {
            x_san.isMax = true;
        }

        // 場の全部より大きいかY
        if (y_san.hand >= maxValue) {
            y_san.isMax = true;
        }

        /*if (x_san.isBigHand) {
            if (x_san.isMax) {
                if (y_san.isMax) {

                } else {

                }

            } else {
                if (y_san.isMax) {

                } else {
                    x_san.hand = a[maxIndex];
                    y_san.hand = a[a.length - 1];
                }
            }
        } else {
            if (y_san.isMax) {
                if (x_san.isMax) {
                    x_san.hand = a[a.length - 1];

                } else {

                }
            } else {
                if (x_san.isMax) {

                } else {

                }
            }
        }*/

        int minEndAbs = Math.abs(a[minIndex] - a[a.length - 1]);
        int maxEndAbs = Math.abs(a[maxIndex] - a[a.length - 1]);

        if (minEndAbs > maxEndAbs) {
            x_san.hand = a[minIndex];

            if (minIndex != a.length - 1) {
                if (y_san.isMax) {
                    x_san.hand = a[a.length -1];
                } else {
                    y_san.hand = a[a.length - 1];
                }
            }
        } else {
            x_san.hand = a[maxIndex];

            if (maxIndex != a.length - 1) {
                y_san.hand = a[a.length - 1];
            }
        }

        out(Math.abs(x_san.hand - y_san.hand));
    }

    /**
     * 決闘者クラス。ディスティニードローで差の絶対値を最大化できる
     * @author parikkus
     *
     */
    public static class Player {

        /** 手札 */
        int hand;

        /** 初期手札相手より大きい */
        boolean isBigHand;

        /** 初期手札場の全てのカードより大きい */
        boolean isMax;

        public Player(int hand) {
            super();
            this.hand = hand;
        }
    }

    /**
     * 次の標準入力をintで受け取ります。
     * @return 標準入力値(int)
     */
    public static int nextInt(Scanner sc) {
        return sc.nextInt();
    }

    /**
     * 次の標準入力をStringで受け取ります。
     * @return 標準入力値(String)
     */
    public static String nextString(Scanner sc) {
        return sc.next();
    }

    /**
     * 次の標準入力を指定回数分intで受け取ります。
     * @param n 取得回数
     * @return 取得した標準入力値の配列(int)
     */
    public static int[] nextInts(Scanner sc, int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt(sc);
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

    public static void putCountMap(Map<Integer, Integer> map, int value) {
        if (map.containsKey(value)) {
            map.put(value, map.get(value) + 1);
        } else {
            map.put(value, 1);
        }
    }
}
