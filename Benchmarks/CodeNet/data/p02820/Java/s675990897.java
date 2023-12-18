import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        char[] t = sc.next().toCharArray();

        // 主処理
        int result = 0;
        for (int i = 0; i < t.length; i++) {
            if (k <= i && t[i - k] == t[i]) {
                t[i] = 'o';
                continue;
            }
            if (t[i] == 'r') {
                result += p;
            } else if (t[i] == 's') {
                result += r;
            } else {
                result += s;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
