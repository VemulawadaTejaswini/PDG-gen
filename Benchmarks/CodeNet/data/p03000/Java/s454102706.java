import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 130<br>
 * B - Bounding<br>
 * <br>
 * <a href=
 * "https://atcoder.jp/contests/abc130/tasks/abc130_b">AtCoderへのリンク</a><br>
 */
public class Main {

    /**
     * エントリポイント
     */
    public static void main(String[] args) {
        // 入力
        Model inputs = input(System.in);
        // 演算
        int count = proc(inputs);
        // 出力
        System.out.println(count);
    }

    /**
     * 入力モデル
     */
    static class Model {
        int N;
        int X;
        List<Integer> list = new ArrayList<Integer>();
    }

    /**
     * 入力値より入力モデルを作成する
     */
    static Model input(InputStream in) {
        Model m = new Model();

        try (Scanner sc = new Scanner(in)) {
            String[] input1 = sc.nextLine().split(" ");
            String[] input2 = sc.nextLine().split(" ");

            m.N = Integer.parseInt(input1[0]);
            m.X = Integer.parseInt(input1[1]);

            for (String str : input2) {
                m.list.add(Integer.parseInt(str));
            }
        }
        return m;
    }

    /**
     * 演算を行う
     */
    static int proc(Model m) {
        int answer = 0;
        int count = 1;
        for (int i = 0; i < m.N; i++) {
            answer = answer + m.list.get(i);
            if (m.X < answer) {
                break;
            }
            count++;
        }
        return count;
    }
}
