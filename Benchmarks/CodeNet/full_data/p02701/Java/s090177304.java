import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    String[] s;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        s = deduplication(s);
        System.out.println(s.length);
    }

    // 配列内の重複を排除
    private String[] deduplication(String[] s) {
        Set<String> deduplicatedList = new LinkedHashSet<String>();
        for (int i = 0; i < s.length; i++) {
            deduplicatedList.add(s[i]);
        }
        String[] ret = deduplicatedList.toArray(new String[deduplicatedList.size()]);
        return ret;
    }
}