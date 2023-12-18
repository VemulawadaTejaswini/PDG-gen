import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 130<br>
 * B - Bounding<br>
 * https://atcoder.jp/contests/abc130/tasks/abc130_b<br>
 */
public class Main {

    public static void main(String[] args) {

        String[] input1;
        String[] input2;

        try (Scanner sc = new Scanner(System.in)) {
            input1 = sc.nextLine().split(" ");
            input2 = sc.nextLine().split(" ");

            int N = Integer.parseInt(input1[0]);
            int X = Integer.parseInt(input1[1]);

            List<Integer> list = new ArrayList<Integer>();
            for (String str : input2) {
                list.add(Integer.parseInt(str));
            }
            // 計算
            int result = calc(N, X, list);

            // 出力
            System.out.println(result);
        } 
    }

    private static int calc(int N, int X, List<Integer> list) {
        int ans = 0;
        int count = 1;
        for (int i = 0; i < N; i++) {
            ans = ans + list.get(i);
            if (X < ans) {
                break;
            }
            count++;
        }
        return count;
    }
}