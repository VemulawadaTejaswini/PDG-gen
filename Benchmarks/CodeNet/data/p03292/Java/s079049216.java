import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.next());
        int a2 = Integer.parseInt(sc.next());
        int a3 = Integer.parseInt(sc.next());

        // 主処理
        int[] a = new int[] { a1, a2, a3 };
        Arrays.sort(a);

        int result = 0;
        result += a[1] - a[0];
        result += a[2] - a[1];

        // 出力
        System.out.println(result);
        sc.close();
    }
}
