import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer.parseInt(sc.next()); // 未使用となる変数n
        Integer q = Integer.parseInt(sc.next());
        String s = sc.next();
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        String[] counts = new String[q];
        for (int i = 0; i < q; i++) {
            int count = 0;
            for (int j = l[i] - 1; j < r[i] - 1; j++) {
                if ('A' == s.charAt(j) && 'C' == s.charAt(j + 1)) {
                    count++;
                }
            }
            counts[i] = Integer.toString(count);
        }

        String result = String.join("\r\n", counts);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
