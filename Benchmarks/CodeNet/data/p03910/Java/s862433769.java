import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        Deque<String> dq = new ArrayDeque<>();
        while (n != 1 && n != 4) {
            n /= 2;
            dq.addFirst(Integer.toString(n + 1));
        }
        if (n == 4) {
            dq.addFirst("3");
        }
        dq.addFirst("1");

        String result = String.join("\r\n", dq);

        // 出力
        System.out.println(result);
    }
}
