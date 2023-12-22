import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // 最初の文字の固まりを整数値と想定して読み込む
        for (int i = 1;; i++) {
            int x = sc.nextInt();
            // xが0の時を考慮した上で、 Case i: x の形式で出力しよう！
            // ...
            if (x == 0) {
                break;
            } else {
                System.out.println("Case "+i+": "+x);
            }
        }
    }
}
