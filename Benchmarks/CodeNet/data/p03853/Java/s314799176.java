import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String[] c = new String[h];
        Arrays.setAll(c, i -> sc.next());
        sc.close();

        // 主処理
        List<String> list = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            list.add(c[i]);
            list.add(c[i]);
        }

        String result = String.join("\n", list);

        // 出力
        System.out.println(result);
    }
}
