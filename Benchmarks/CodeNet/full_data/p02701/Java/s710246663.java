import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] a = new String[n];
        Arrays.setAll(a, i -> sc.next());
        sc.close();

        // 主処理
        Set<String> set = new HashSet<>(Arrays.asList(a));
        int result = set.size();

        // 出力
        System.out.println(result);
    }
}
