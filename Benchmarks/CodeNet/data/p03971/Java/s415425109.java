import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    int n;
    int a;
    int b;
    String s;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        s = sc.next();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        char[] sList = s.toCharArray();
        int ab = a + b;
        int b_rank = 1;
        int cur = 0;

        for (int i = 0; i < sList.length; i++) {
            if (sList[i]=='a' && cur < ab) {
                cur++;
                System.out.println("Yes");
            } else if (sList[i]=='b' && b >= b_rank && cur < ab) {
                cur++;
                b_rank++;
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}