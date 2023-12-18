import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        Deque<String> dq = new ArrayDeque<>();
        for (int i = n - 1; 0 <= i; i--) {
            for (int index = i; 0 <= index; index--) {
                if (b.get(index) == index + 1) {
                    dq.addFirst(Integer.toString(b.get(index)));
                    b.remove(index);
                    break;
                }
            }
        }
        String result = b.isEmpty() ? String.join("\r\n", dq) : "-1";

        // 出力
        System.out.println(result);
    }
}
