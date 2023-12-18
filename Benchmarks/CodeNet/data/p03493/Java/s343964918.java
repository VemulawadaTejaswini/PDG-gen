import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * すぬけ君は1,2,3の番号がついた3つのマスからなるマス目を持っています。
 * 各マスには 0 か 1 が書かれており、マスiにはs iが書かれています。
 *
 * すぬけ君は 1 が書かれたマスにビー玉を置きます。
 * ビー玉が置かれるマスがいくつあるか求めてください。
 *
 * # restrict
 * s1, s2, s3 は、'0', '1'
 *
 * # input
 * 入力は以下の形式で標準入力から与えられる。
 * s1s2s3
 *
 * #
 */
public class Main {
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);

        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        int count = list.stream()
                .filter( str -> str == 1)
                .collect(Collectors.toList())
                .size();

        System.out.print(count);
    }
}
