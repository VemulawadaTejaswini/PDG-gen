import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        Arrays.setAll(s, i -> sc.next());
        sc.close();

        // 主処理
        Set<String> set = new HashSet<>(Arrays.asList(s));
        boolean judge = set.size() == 3;
        String result = judge ? "Three" : "Four";

        // 出力
        System.out.println(result);
    }
}
