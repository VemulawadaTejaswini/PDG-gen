
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int n = sc.nextInt();
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            intList.add(sc.nextInt());
        }
        sc.close();
        int result = 0;
        int cntj = 0;
        int cntk = 0;
        for (int j : intList) {
            cntj++;
            cntk = 0;
            result++;
            for (int k : intList) {
                cntk++;
                if (cntk == cntj) {
                    continue;
                }
                if (j % k == 0) {
                    result--;
                    break;
                }
            }

        }

        System.out.println(result);
    }
}
