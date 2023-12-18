import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 129<br>
 * B - Balance<br>
 * <br>
 * <a href=
 * "https://atcoder.jp/contests/abc129/tasks/abc129_b">AtCoderへのリンク</a><br>
 */
public class Main {

    /**
     * エントリポイント
     */
    public static void main(String[] args) {
        // 入力
        Model m = input(System.in);
        // 演算
        int result = proc(m);
        // 出力
        System.out.println(result);
    }

    /**
     * 入力モデル
     */
    static class Model {
        /** オモリの数 */
        int N;
        /** オモリの重さリスト */
        List<Integer> list = new ArrayList<Integer>();
    }

    /**
     * 入力値より入力モデルを作成する
     */
    static Model input(InputStream in) {
        Model m = new Model();
        try (Scanner sc = new Scanner(in)) {
            String[] line1 = sc.nextLine().split("");
            String[] line2 = sc.nextLine().split(" ");

            m.N = Integer.parseInt(line1[0]);
            for (String str : line2) {
                m.list.add(Integer.parseInt(str));
            }
        }
        return m;
    }

    /**
     * 演算を行う
     */
    static int proc(final Model m) {
        int abs = Integer.MAX_VALUE;

        for (int i = 0; i < m.N; i++) {
            List<Integer> listS1 = m.list.subList(0, i + 1);
            List<Integer> listS2 = m.list.subList(i + 1, m.N);

            int S1 = sumAll(listS1);
            int S2 = sumAll(listS2);

            abs = Math.min(abs, Math.abs(S2 - S1));
        }
        return abs;
    }

    /**
     * リストを全て加算する
     */
    static int sumAll(final List<Integer> list) {
        int result = 0;

        for (Integer num : list) {
            result += num;
        }
        return result;
    }
}