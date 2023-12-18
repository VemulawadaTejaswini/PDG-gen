import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    String s;
    char[] ch;
    char[] ch1;
    char[] ch2;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        ch = s.toCharArray();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        int n = ch.length;
        boolean c1 = true;
        boolean c2 = true;
        boolean c3 = true;

        ch1 = new char[(n - 1) / 2];
        ch2 = new char[(n - 1) / 2];
        for (int i = 0; i < (n - 1) / 2; i++) {
            ch1[i] = ch[i];
        }
        for (int i = 0; i <= n - (n + 3) / 2; i++) {
            ch2[i] = ch[i - 1 + ((n + 3) / 2)];
        }
        c1 = check(ch);
        c2 = check(ch1);
        c3 = check(ch2);
        if (c1 && c2 && c3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private boolean check(char[] target) {
        boolean res = true;
        for (int i = 0; i < target.length / 2; i++) {
            if (target[i] != target[target.length - i - 1]) {
                res = false;
            }
        }
        return res;
    }
}