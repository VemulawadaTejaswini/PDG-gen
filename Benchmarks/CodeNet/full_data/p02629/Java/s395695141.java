import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        String[] base26 = Long.toString(n - 1, 26).split("");
        Deque<String> dq = new ArrayDeque<>();
        int minus = 0;
        for (int i = base26.length - 1; 0 <= i; i--) {
            int index = Integer.parseInt(base26[i], 26);
            index += minus;
            if (index < 0) {
                minus--;
                index += 26;
            } else if (i == base26.length - 1) {
                minus--;
            }
            if (i == 0 && "z".equals(dq.peekFirst())) {
                break;
            }
            char c = (char) ((int) 'a' + index);
            dq.addFirst(String.valueOf(c));
        }

        String result = String.join("", dq);

        // 出力
        System.out.println(result);
    }
}
